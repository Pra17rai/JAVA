

public class Main {
    public static void main(String[] args) {

        // User sgive input --> S, R, P
        //If input ! = S R P re do.
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        //(S,R,P)
        char _uChoice, _userMove;

        while (true){
            while (true){
                System.out.println("=-=-=-=-=-=  Rock Paper Scissor  =-=-=-=-=-=");
                System.out.println("\t---> S");
                System.out.println("\t---> P");
                System.out.println("\t---> R");

                System.out.print("\tEnter your choice : ");
                _uChoice = scan.next().charAt(0);
                _userMove = Character.toUpperCase(_uChoice);
                if(_userMove == 'S' || _userMove == 'R'|| _userMove == 'P'){
//                System.out.println(_userMove);
                    break;
                }else{
                    System.out.println("\tInvalid choice!! Please re-enter your choice: ");
                }
            }
//        System.out.println("The user input is : "+ _userChoice);

            char[] _computerChoice = {'S', 'P', 'R'};
            int _randNum = random.nextInt(3);
            //System.out.println(_randNum);
            char _compMove = _computerChoice[_randNum];
            System.out.println("\n\t--->Player Move : " + _userMove);
            System.out.println("\t---> Computer Move : " + _compMove);

            if(_userMove == _compMove){
                System.out.println("\tIts a Draw!!");
            } else if (_userMove == 'S' && _compMove == 'P') {
                System.out.println("\tPlayer Wins!!");
            } else if (_userMove == 'P' && _compMove == 'R') {
                System.out.println("\tPlayer Wins!!");
            }else if (_userMove == 'R' && _compMove == 'S') {
                System.out.println("\tPLayer Wins!!");
            }else{
                System.out.println("\tComputer Wins!!");
            }


            char _playAgain;
            System.out.print("\n\n\t---> TO PLAY AGAIN. PLEASE ENTER YOUR CHOICE: (Y/N) : ");
            _playAgain = scan.next().charAt(0);
            _playAgain = Character.toUpperCase(_playAgain);
            if(_playAgain == 'Y'){
                continue;
            }else{
                break;
            }
        }


    }
}