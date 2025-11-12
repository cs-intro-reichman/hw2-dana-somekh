public class Cheers {
        public static void main(String[] args) {
                String cheer = args[0];
                String upperCheer = cheer.toUpperCase();
                int cnt = Integer.parseInt(args[1]);
                for (int i = 0; i < upperCheer.length(); i ++) {
                        String giveMeString = "Give me ";
                        String aAn;
                        char letter = upperCheer.charAt(i);
                        if ("AEFHILMNORSX".indexOf(letter) != -1){
                                aAn = "an ";
                        }
                        else {
                                aAn = "a ";                               
                        }
                        System.out.println(giveMeString + aAn + letter + ": " + letter + "!");
                }   
                System.out.println("What does that spell?");
                for (int i = 0; i < cnt; i ++) {
                        System.out.println(upperCheer + "!!!");
                }
        }
        }
