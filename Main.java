import Controllers.PostController;
import Dtos.Request.CreatePostRequest;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;
//@SpringBootApplication
public class Main {
    static Scanner keyboardInput = new Scanner(System.in);
    private static PostController postController = new PostController();

    public static void main(String[] args) {
        System.out.println("Hello User!");
        //displayMainMenu();
    }

    private static void displayMainMenu(){
        String mainMenu = """
                press 1 for create post
                press 2 for view post
                press 3 to exit
                """;
        String userInput = input(mainMenu);
        switch ((Integer.parseInt(String.valueOf(userInput.charAt(0))))){
            case 1 : createPost();
            case 2 : viewPost();
            case 3 : exitFromApp();
        }
        
    }

    private static void exitFromApp() {
        print("thanks for using the App");
        System.exit(0);
    }

    private static void viewPost() {
        String userInput = input("Enter post id or 0 to exit");
        if("0".equals(userInput)){
            displayMainMenu();
        }
        showPost(userInput);
    }

    private static <PostNotFoundException extends Throwable > void showPost(String postId) {
        try{
            print(postController.viewPost(Integer.parseInt(postId)).toString());
        }
        catch (NumberFormatException pnf){
            print("please enter a valid id");
            viewPost();
        }
//        catch (PostNotFoundException ){
//            print("post not found....check that id is correct");
//            viewPost();
//        }
    }

    private static void createPost() {
        String title = input("Enter post title:");
        String body = input("Enter post Body:");
        CreatePostRequest postRequest = new CreatePostRequest();
        postRequest.setTitle(title);
        postRequest.setBody(body);
        print(postController.createPost(postRequest));
        displayMainMenu();
    }

    private static String input(String prompt){
        print(prompt);
        return keyboardInput.nextLine();
    }
    private static void print(String prompt){
        System.out.println(prompt);
    }
}
