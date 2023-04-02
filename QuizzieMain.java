import java.util.*;
class QuizGame
{
	int Topic,Rate;
	int score=0;
	String answer;
	String Name,UserId,Feedback_Response,Rate_response;
	String Response;
	int Difficulty;
	long StartTimeOfQuizzie;
	long EndTimeOfQuizzie;
	long TotalTimeTaken;
	long  TotalQuizzieSeconds;
	boolean flag;
}
class Quizzie extends QuizGame
{		
		void User(Quizzie A)
		{
			
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter Your Name=");
			Name=sc.next();
			A.UserId=IdGeneration(A);
			System.out.println("Your Gaming Name is "+A.UserId);
			
			
		}
	String IdGeneration(Quizzie A)
	{
			Random A1=new Random();
			 int  k=A1.nextInt(1000,2000);
		return "Quiziie_"+Name+k;
	}
	void Rate()
	{
		System.out.println("Rate Our Game Between [0-5] Out Of 5 ");
		Scanner sc=new Scanner(System.in);
		
		 flag=true;
				while(flag)
				{
				Rate=sc.nextInt();
				sc.nextLine();
		if(Rate==0||Rate==1||Rate==2||Rate==3||Rate==4||Rate==5)
				{
                flag=false;
				
				}
				else
				{	
                System.out.print("Please Enter Valid Input=");
				}}
		if(Rate<=3)
		{
			System.out.println("Dear"+UserId);
			System.out.println("We are sorry to see that you gave us a low rating.\nWe take all feedback seriously and are committed to improving our game.\nCan you please share more details about your experience so we can address any issues?");
			Feedback_Response=sc.nextLine();
			System.out.println("Your satisfaction is our top most priority.Thank You For Your Response We Will Work On It Out");
		}
		else
		{	
			System.out.println("Thank you for your positive Rating! We're glad you enjoyed our game.Your high rating means a lot to us.\nThank you for choosing us..!Hope to see you again");
			
		}
	}
	void Instructions()
	{
		
	System.out.println("Welcome to Quiziie a Quiz game ");
	System.out.println("We're Excited To Have You Here And Can't Wait To Test Your Knowledge Get Ready To Answer Questions On A Wide Range Of Topics Our Game Is Easy To Play And A Lot Of Fun Make Sure To Read The Question Carefully And Provide Your Answer Remember,The Clock Is Ticking,so Stay Focused!");
	System.out.println("Good Luck And Have Fun!");
	System.out.println("***********************************************************INSTRUCTIONS*************************************************************************************************************************************************************************************************************************************************");
	System.out.println("There Are Five Questions Simply Type Your Answer From The Options Provided.\nEach Correct Answer Will Earn You One Quizzie Point\nTo Win Our Quiz Game,you Must Score 3 Or More Quizzie Points.Quizzie Points Are Earned By Correctly Answering Questions Throughout The Game.");
	System.out.println("************************************************************************************************************************************************************************************************************************************************************************************************************************");
	}
	void TopicList()
	{
		Scanner sc=new Scanner(System.in);
	System.out.println("Hello "+UserId+"\nChoose a number of your interest of topic that you want play a quiz on a our Quiziie from the given list");
	System.out.println("1.MathsQuiz");
	System.out.println("2.PhysicsQuiz");
	System.out.println("3.HistoryQuiz");
	System.out.println("4.BollywoodRelatedQuiz");
	System.out.println("5.MythologicalQuiz");
	System.out.println("6.EnvironmentalQuiz");
	System.out.print("Enter Choice Of Number=");
		
}
	void TakeTopicInput(Quizzie A){
		Scanner sc=new Scanner(System.in);
	
		 flag=true;
				while(flag)
				{
				A.Topic=sc.nextInt();
				sc.nextLine();
		if(Topic==6||Topic==1||Topic==2||Topic==3||Topic==4||Topic==5)
				{
                flag=false;
				
				}
				else
				{	
                System.out.print("Please Enter Valid Input=");
				}}
	}
	void DifficultyLevel(Quizzie A){
		Scanner sc=new Scanner(System.in);
		System.out.println("Choose number of Difficulty Level that you want play");
		System.out.println("1.Easy\n2.Hard");
		System.out.print("Response=");
			
			 flag=true;
				while(flag)
				{
				A.Difficulty=sc.nextInt();
				sc.nextLine();
		if(Difficulty==1||Difficulty==2)
				{
                flag=false;
				
				}
				else
				{	
                System.out.print("Please Enter Valid Input=");
				}}
	}

	void Questions(Quizzie A){
		Scanner sc=new Scanner(System.in);
	switch(A.Difficulty){
		
	case 1:
	switch(A.Topic)	{
		case 1:
		StartTimeOfQuizzie=System.currentTimeMillis();
		System.out.println("Here We Start your maths quiz");
		  System.out.println("[Que-1]What is the sum of 130+125+191?");
                    System.out.println("A.335");
                    System.out.println("B.789");
                    System.out.println("C.446");
                    System.out.println("D.789");
					System.out.print("Answer=");
                   flag=true;
				while(flag)
				{
				A.answer=sc.next();
				if(answer.equalsIgnoreCase("a")||answer.equalsIgnoreCase("b")||answer.equalsIgnoreCase("c")||answer.equalsIgnoreCase("d"))
				{
                flag=false;
				
				}
				else
				{	
                System.out.print("Please Enter Valid Input=");
				}}
                    if (answer.equalsIgnoreCase("C")) {
                       A.score++;
                    }
                    System.out.println("[Que-2]50 times of 10 is equal to:");
                    System.out.println("A.100000");
                    System.out.println("B.500");
                    System.out.println("C.78900");
                    System.out.println("D.564");
					System.out.print("Answer=");
                    flag=true;
				while(flag)
				{
				A.answer=sc.next();
				if(answer.equalsIgnoreCase("a")||answer.equalsIgnoreCase("b")||answer.equalsIgnoreCase("c")||answer.equalsIgnoreCase("d"))
				{
                flag=false;
				
				}
				else
				{	
                System.out.print("Please Enter Valid Input=");
				}}
                    if (answer.equalsIgnoreCase("B")) {
                        A.score++;
                    }
					 System.out.println("[Que-3]870 Minus 100 is equal to:");
                    System.out.println("A.456");
                    System.out.println("B.770");
                    System.out.println("C.900");
                    System.out.println("D.54");
					System.out.print("Answer=");
                   flag=true;
				while(flag)
				{
				A.answer=sc.next();
				if(answer.equalsIgnoreCase("a")||answer.equalsIgnoreCase("b")||answer.equalsIgnoreCase("c")||answer.equalsIgnoreCase("d"))
				{
                flag=false;
				
				}
				else
				{	
                System.out.print("Please Enter Valid Input=");
				}}
                    if (answer.equalsIgnoreCase("B")) {
                        A.score++;
                    }
					
					System.out.println("[Que-4]70 Multiply by 100 is equal to:");
                    System.out.println("A.7000");
                    System.out.println("B.700");
                    System.out.println("C.770");
                    System.out.println("D.789");
					System.out.print("Answer=");
                   flag=true;
				while(flag)
				{
				A.answer=sc.next();
				if(answer.equalsIgnoreCase("a")||answer.equalsIgnoreCase("b")||answer.equalsIgnoreCase("c")||answer.equalsIgnoreCase("d"))
				{
                flag=false;
				
				}
				else
				{	
                System.out.print("Please Enter Valid Input=");
				}}
                    if (answer.equalsIgnoreCase("A")) {
                        A.score++;
                    }
					System.out.println("[Que-5]45 divide by 100 is equal to:");
                    System.out.println("A.0.45");
                    System.out.println("B.0.045");
                    System.out.println("C.01230");
                    System.out.println("D.0450");
					System.out.print("Answer=");
                   flag=true;
				while(flag)
				{
				A.answer=sc.next();
				if(answer.equalsIgnoreCase("a")||answer.equalsIgnoreCase("b")||answer.equalsIgnoreCase("c")||answer.equalsIgnoreCase("d"))
				{
                flag=false;
				
				}
				else
				{	
                System.out.print("Please Enter Valid Input=");
				}}
                    if (answer.equalsIgnoreCase("A")) {
                        A.score++;
                    }
					 EndTimeOfQuizzie = System.currentTimeMillis();
         		  TotalTimeTaken = EndTimeOfQuizzie - StartTimeOfQuizzie;
				  TotalQuizzieSeconds = TotalTimeTaken/ 1000;
				  StartTimeOfQuizzie=0;
				 System.out.println("Total Time Taken To Attempt the quiz is "+TotalQuizzieSeconds+" Seconds");
				 if(TotalQuizzieSeconds>30)
				 {
					 System.out.println("Sorry to say "+UserId+"But Your total time taken to attempt this quiz is "+TotalQuizzieSeconds+" seconds which is more than 30 seconds\ndon't worry - take your time and try to improve your speed on the next question. Remember, practice makes perfect, and every question is an opportunity to learn and grow. Good luck and have fun!");
				 }
				 else
				 {
					 System.out.println("Great job ..!"+UserId+"\nYou have done fantasic Work Your total time taken to attempt this quiz is "+TotalQuizzieSeconds+"Seconds");
				 }
		break;
		case 2:
		StartTimeOfQuizzie=System.currentTimeMillis();
		System.out.println("Here We Start your phy game");
		  System.out.println("[Que-1]Total Internal Reflection(TIR) would happen only if ?");
                    System.out.println("A. The ray must travel from a denser to a rarer medium");
                    System.out.println("B. The ray must not travel from a denser to a rarer medium");
                    System.out.println("C. Incorrect Question ");
                    System.out.println("D. The angle of incidence in rarer medium is greater than the critical angle ");
                    System.out.print("Answer=");
					flag=true;
				while(flag)
				{
				A.answer=sc.next();
				if(answer.equalsIgnoreCase("a")||answer.equalsIgnoreCase("b")||answer.equalsIgnoreCase("c")||answer.equalsIgnoreCase("d"))
				{
                flag=false;
				
				}
				else
				{	
                System.out.print("Please Enter Valid Input=");
				}}
                    if (answer.equalsIgnoreCase("A")) {
                        A.score++;
                    }
                    System.out.println("[Que-2]How much current Flows in reverse biased circuit");
                    System.out.println("A. 12330");
                    System.out.println("B. not defined");
                    System.out.println("C. infinite");
                    System.out.println("D. 0");
					System.out.print("Answer=");
                   flag=true;
				while(flag)
				{
				A.answer=sc.next();
				if(answer.equalsIgnoreCase("a")||answer.equalsIgnoreCase("b")||answer.equalsIgnoreCase("c")||answer.equalsIgnoreCase("d"))
				{
                flag=false;
				
				}
				else
				{	
                System.out.print("Please Enter Valid Input=");
				}}
                    if (answer.equalsIgnoreCase("d")) {
                        A.score++;
                    }
					System.out.println("[Que-3]The value of plank constant is.?");
                    System.out.println("A. 6.634*10^-34");
                    System.out.println("B. not defined");
                    System.out.println("C. infinite");
                    System.out.println("D. 6.634*10^-38");
					System.out.print("Answer=");
                   flag=true;
				while(flag)
				{
				A.answer=sc.next();
				if(answer.equalsIgnoreCase("a")||answer.equalsIgnoreCase("b")||answer.equalsIgnoreCase("c")||answer.equalsIgnoreCase("d"))
				{
                flag=false;
				
				}
				else
				{	
                System.out.print("Please Enter Valid Input=");
				}}
                    if (answer.equalsIgnoreCase("A")) {
                        A.score++;
                    }
					System.out.println("[Que-4]The Maximum disperssion of white light in prissiom is possible in which colour.?");
                    System.out.println("A. pink");
                    System.out.println("B. red");
                    System.out.println("C. green");
                    System.out.println("D. violet");
					System.out.print("Answer=");
                      flag=true;
				while(flag)
				{
				A.answer=sc.next();
				if(answer.equalsIgnoreCase("a")||answer.equalsIgnoreCase("b")||answer.equalsIgnoreCase("c")||answer.equalsIgnoreCase("d"))
				{
                flag=false;
				
				}
				else
				{	
                System.out.print("Please Enter Valid Input=");
				}}
                    if (answer.equalsIgnoreCase("D")) {
                        A.score++;
                    }
					System.out.println("[Que-5] What types waves are light waves?");
                    System.out.println("A. Longetidunal");
                    System.out.println("B. Transvese");
                    System.out.println("C. BothA & B");
                    System.out.println("D. None");
					System.out.print("Answer=");
                      flag=true;
				while(flag)
				{
				A.answer=sc.next();
				if(answer.equalsIgnoreCase("a")||answer.equalsIgnoreCase("b")||answer.equalsIgnoreCase("c")||answer.equalsIgnoreCase("d"))
				{
                flag=false;
				
				}
				else
				{	
                System.out.print("Please Enter Valid Input=");
				}}
                    if (answer.equalsIgnoreCase("B")) {
                        A.score++;
                    }
					 EndTimeOfQuizzie = System.currentTimeMillis();
         		  TotalTimeTaken = EndTimeOfQuizzie - StartTimeOfQuizzie;
				  TotalQuizzieSeconds = TotalTimeTaken/ 1000;
				   StartTimeOfQuizzie=0;
				  if(TotalQuizzieSeconds>30)
				 {
					 System.out.println("Sorry to say "+UserId+"But Your total time taken to attempt this quiz is "+TotalQuizzieSeconds+"seconds which is more than 30 seconds\ndon't worry - take your time and try to improve your speed on the next question. Remember, practice makes perfect, and every question is an opportunity to learn and grow. Good luck and have fun!");
				 }
				 else
				 {
					 System.out.println("Great job ..!"+UserId+"\nYou have done fantasic Work Your total time taken to attempt this quiz is "+TotalQuizzieSeconds);
				 }
					break;
					case 3:
					StartTimeOfQuizzie=System.currentTimeMillis();
		System.out.println("Here We Start your History Quiz");
		  System.out.println("[Que-1]What year did World War I begin?");
                    System.out.println("A. 1914");
                    System.out.println("B. 1918");
                    System.out.println("C. 1939");
                    System.out.println("D. 1989");
					System.out.print("Answer=");
                    flag=true;
				while(flag)
				{
				A.answer=sc.next();
				if(answer.equalsIgnoreCase("a")||answer.equalsIgnoreCase("b")||answer.equalsIgnoreCase("c")||answer.equalsIgnoreCase("d"))
				{
                flag=false;
				
				}
				else
				{	
                System.out.print("Please Enter Valid Input=");
				}}
                    if (answer.equalsIgnoreCase("A")) {
                        A.score++;
                    }
                       System.out.println("[Que-2]Who is first prime minister of india");
                    System.out.println("A. Jawaharlal nehru");
                    System.out.println("B. Sardar patel");
                    System.out.println("C. k.k bozz");
                    System.out.println("D. none");
					System.out.print("Answer=");
                      flag=true;
				while(flag)
				{
				A.answer=sc.next();
				if(answer.equalsIgnoreCase("a")||answer.equalsIgnoreCase("b")||answer.equalsIgnoreCase("c")||answer.equalsIgnoreCase("d"))
				{
                flag=false;
				
				}
				else
				{	
                System.out.print("Please Enter Valid Input=");
				}}
                    if (answer.equalsIgnoreCase("a")) {
                        A.score++;
                    }
					System.out.println("[Que-3]How many world war happened till now.?");
                    System.out.println("A. 2");
                    System.out.println("B. 1");
                    System.out.println("C. infinite");
                    System.out.println("D. 0");
					System.out.print("Answer=");
                flag=true;
				while(flag)
				{
				A.answer=sc.next();
				if(answer.equalsIgnoreCase("a")||answer.equalsIgnoreCase("b")||answer.equalsIgnoreCase("c")||answer.equalsIgnoreCase("d"))
				{
                flag=false;
				
				}
				else
				{	
                System.out.print("Please Enter Valid Input=");
				}}
                    if (answer.equalsIgnoreCase("A")) {
                        A.score++;
                    }
					System.out.println("[Que-4]who known as iron man of india.?");
                    System.out.println("A. Jawaharlal nehru");
                    System.out.println("B. Sardar patel");
                    System.out.println("C. k.k bozz");
                    System.out.println("D. None");
					System.out.print("Answer=");
                     flag=true;
				while(flag)
				{
				A.answer=sc.next();
				if(answer.equalsIgnoreCase("a")||answer.equalsIgnoreCase("b")||answer.equalsIgnoreCase("c")||answer.equalsIgnoreCase("d"))
				{
                flag=false;
				
				}
				else
				{	
                System.out.print("Please Enter Valid Input=");
				}}
                    if (answer.equalsIgnoreCase("B")) {
                        A.score++;
                    }
					System.out.println("[Que-5] What is name of jansi ki rani?");
                    System.out.println("A. Laxmibai");
                    System.out.println("B. kisnabai");
                    System.out.println("C. BothA & B");
                    System.out.println("D. None");
					System.out.print("Answer=");
              flag=true;
				while(flag)
				{
				A.answer=sc.next();
				if(answer.equalsIgnoreCase("a")||answer.equalsIgnoreCase("b")||answer.equalsIgnoreCase("c")||answer.equalsIgnoreCase("d"))
				{
                flag=false;
				
				}
				else
				{	
                System.out.print("Please Enter Valid Input=");
				}}
                    if (answer.equalsIgnoreCase("A")) {
                        A.score++;
                    }
				 EndTimeOfQuizzie = System.currentTimeMillis();
         		 TotalTimeTaken = EndTimeOfQuizzie - StartTimeOfQuizzie;
				 TotalQuizzieSeconds = TotalTimeTaken/ 1000;
				  StartTimeOfQuizzie=0;
				 if(TotalQuizzieSeconds>30)
				 {
					 System.out.println("Sorry to say "+UserId+"But Your total time taken to attempt this quiz is "+TotalQuizzieSeconds+"seconds which is more than 30 seconds\ndon't worry - take your time and try to improve your speed on the next question. Remember, practice makes perfect, and every question is an opportunity to learn and grow. Good luck and have fun!");
				 }
				 else
				 {
					 System.out.println("Great job ..!"+UserId+"\nYou have done fantasic Work Your total time taken to attempt this quiz is "+TotalQuizzieSeconds);
				 }
					break;
					case 4:
					StartTimeOfQuizzie=System.currentTimeMillis();
		System.out.println("Here We Start your BollywoodRelatedQuiz");
		  System.out.println("[Que-1]Actor Sushant Singh Rajput was born in ___ city ?");
                    System.out.println("A. Ranchi");
                    System.out.println("B. Patna");
                    System.out.println("C. Bhopal");
                    System.out.println("D. Mumbai");
					System.out.print("Answer=");
                 flag=true;
				while(flag)
				{
				A.answer=sc.next();
				if(answer.equalsIgnoreCase("a")||answer.equalsIgnoreCase("b")||answer.equalsIgnoreCase("c")||answer.equalsIgnoreCase("d"))
				{
                flag=false;
				
				}
				else
				{	
                System.out.print("Please Enter Valid Input=");
				}}
                    if (answer.equalsIgnoreCase("b")) {
                        A.score++;
                    }
					  System.out.println("[Que-2]Which was Indiaâ€™s First Sound movie ?");
                    System.out.println("A. Alam Ara");
                    System.out.println("B. Sholay");
                    System.out.println("C. Dosti");
                    System.out.println("D. none");
					System.out.print("Answer=");
                  flag=true;
				while(flag)
				{
				A.answer=sc.next();
				if(answer.equalsIgnoreCase("a")||answer.equalsIgnoreCase("b")||answer.equalsIgnoreCase("c")||answer.equalsIgnoreCase("d"))
				{
                flag=false;
				
				}
				else
				{	
                System.out.print("Please Enter Valid Input=");
				}}
                    if (answer.equalsIgnoreCase("a")) {
                        A.score++;
                    }
					System.out.println("[Que-3]At what age, legend actor Kishore Kumar died ??");
                    System.out.println("A. 24");
                    System.out.println("B. 51");
                    System.out.println("C. 58");
                    System.out.println("D. 100");
					System.out.print("Answer=");
				flag=true;
				while(flag)
				{
				A.answer=sc.next();
				if(answer.equalsIgnoreCase("a")||answer.equalsIgnoreCase("b")||answer.equalsIgnoreCase("c")||answer.equalsIgnoreCase("d"))
				{
                flag=false;
				
				}
				else
				{	
                System.out.print("Please Enter Valid Input=");
				}}
                    if (answer.equalsIgnoreCase("c")) {
                        A.score++;
                    }
					System.out.println("[Que-4]Who was the first Indian to win an Oscar ?");
                    System.out.println("A. Amitabh bachhan");
                    System.out.println("B. Bhanu Athaiya");
                    System.out.println("C. k.k bozz");
                    System.out.println("D. None");
					System.out.print("Answer=");
                    flag=true;
				while(flag)
				{
				A.answer=sc.next();
				if(answer.equalsIgnoreCase("a")||answer.equalsIgnoreCase("b")||answer.equalsIgnoreCase("c")||answer.equalsIgnoreCase("d"))
				{
                flag=false;
				
				}
				else
				{	
                System.out.print("Please Enter Valid Input=");
				}}
                    if (answer.equalsIgnoreCase("B")) {
                        A.score++;
                    }
					System.out.println("[Que-5] Who was the director of 3 idiot movie?");
                    System.out.println("A. Skdutt");
                    System.out.println("B. kishankumar");
                    System.out.println("C. BothA & B");
                    System.out.println("D. Rajkumar Hirani");
					System.out.print("Answer=");
                   flag=true;
				while(flag)
				{
				A.answer=sc.next();
				if(answer.equalsIgnoreCase("a")||answer.equalsIgnoreCase("b")||answer.equalsIgnoreCase("c")||answer.equalsIgnoreCase("d"))
				{
                flag=false;
				
				}
				else
				{	
                System.out.print("Please Enter Valid Input=");
				}}
                    if (answer.equalsIgnoreCase("A")) {
                        A.score++;
                    }
					 EndTimeOfQuizzie = System.currentTimeMillis();
         		 TotalTimeTaken = EndTimeOfQuizzie - StartTimeOfQuizzie;
				 TotalQuizzieSeconds = TotalTimeTaken/ 1000;
					 StartTimeOfQuizzie=0;
				 System.out.println("Total Time Taken To Attempt the quiz is "+TotalQuizzieSeconds+" Seconds");
                     
					break;
					case 5:
					StartTimeOfQuizzie=System.currentTimeMillis();
		System.out.println("Here We Start your MythologicalQuiz");
		 System.out.println("[Que-1]In Hindu mythology, who was the first man to die?");
                    System.out.println("A. Yama");
                    System.out.println("B. Ganesha");
                    System.out.println("C. Krishna");
                    System.out.println("D. Surya");
					System.out.print("Answer=");
                     flag=true;
				while(flag)
				{
				A.answer=sc.next();
				if(answer.equalsIgnoreCase("a")||answer.equalsIgnoreCase("b")||answer.equalsIgnoreCase("c")||answer.equalsIgnoreCase("d"))
				{
                flag=false;
				
				}
				else
				{	
                System.out.print("Please Enter Valid Input=");
				}}
                    if (answer.equalsIgnoreCase("A")) {
                        A.score++;
                    }
					  System.out.println("[Que-2]ho is known as Dashavatar?");
                    System.out.println("A. Lord Vishnu");
                    System.out.println("B. Lord Shiva");
                    System.out.println("C. Lord rama");
                    System.out.println("D. none");
					System.out.print("Answer=");
                     flag=true;
				while(flag)
				{
				A.answer=sc.next();
				if(answer.equalsIgnoreCase("a")||answer.equalsIgnoreCase("b")||answer.equalsIgnoreCase("c")||answer.equalsIgnoreCase("d"))
				{
                flag=false;
				
				}
				else
				{	
                System.out.print("Please Enter Valid Input=");
				}}
                    if (answer.equalsIgnoreCase("a")) {
                        A.score++;
                    }
					System.out.println("[Que-3]Who are the Tridev?");
                    System.out.println("A. brahma");
                    System.out.println("B. vishnu");
                    System.out.println("C. mahesh");
                    System.out.println("D. a,b,c");
					System.out.print("Answer=");
                    flag=true;
				while(flag)
				{
				A.answer=sc.next();
				if(answer.equalsIgnoreCase("a")||answer.equalsIgnoreCase("b")||answer.equalsIgnoreCase("c")||answer.equalsIgnoreCase("d"))
				{
                flag=false;
				
				}
				else
				{	
                System.out.print("Please Enter Valid Input=");
				}}
                    if (answer.equalsIgnoreCase("d")) {
                        A.score++;
                    }
					System.out.println("[Que-4] Lord Rama belonged to which of the following era or Yuga? ?");
                    System.out.println("A. Treta Yug");
                    System.out.println("B. kali yug");
                    System.out.println("C. Dwapar yug");
                    System.out.println("D. none");
					System.out.print("Answer=");
                flag=true;
				while(flag)
				{
				A.answer=sc.next();
				if(answer.equalsIgnoreCase("a")||answer.equalsIgnoreCase("b")||answer.equalsIgnoreCase("c")||answer.equalsIgnoreCase("d"))
				{
                flag=false;
				
				}
				else
				{	
                System.out.print("Please Enter Valid Input=");
				}}
                    if (answer.equalsIgnoreCase("a")) {
                        A.score++;
                    }
					System.out.println("[Que-5] Who is father of arjuna");
                    System.out.println("A. Pandu");
                    System.out.println("B. kishan");
                    System.out.println("C. Dhruthrastra");
                    System.out.println("D. None");
					System.out.print("Answer=");
                    flag=true;
				while(flag)
				{
				A.answer=sc.next();
				if(answer.equalsIgnoreCase("a")||answer.equalsIgnoreCase("b")||answer.equalsIgnoreCase("c")||answer.equalsIgnoreCase("d"))
				{
                flag=false;
				
				}
				else
				{	
                System.out.print("Please Enter Valid Input=");
				}}
                    if (answer.equalsIgnoreCase("A")) {
                        A.score++;
                    }
			
					
                      EndTimeOfQuizzie = System.currentTimeMillis();
         		 TotalTimeTaken = EndTimeOfQuizzie - StartTimeOfQuizzie;
				 TotalQuizzieSeconds = TotalTimeTaken/ 1000;
				  StartTimeOfQuizzie=0;
				 if(TotalQuizzieSeconds>30)
				 {
					 System.out.println("Sorry to say "+UserId+"But Your total time taken to attempt this quiz is "+TotalQuizzieSeconds+"seconds which is more than 30 seconds\ndon't worry - take your time and try to improve your speed on the next question. Remember, practice makes perfect,/nand every question is an opportunity to learn and grow. Good luck and have fun!");
				 }
				 else
				 {
					 System.out.println("Great job ..!"+UserId+"\nYou have done fantasic Work Your total time taken to attempt this quiz is "+TotalQuizzieSeconds);
				 }
				break;
	
					case 6:
					StartTimeOfQuizzie=System.currentTimeMillis();
					System.out.println("Here We Start your EnvironmentalQuiz");
		 System.out.println("[Que-1]In Enviroment which gas is the most?");
                    System.out.println("A. Nitrogen");
                    System.out.println("B. Oxygen");
                    System.out.println("C. So2");
                    System.out.println("D. Potasium");
					System.out.print("Answer=");
                     flag=true;
				while(flag)
				{
				A.answer=sc.next();
				if(answer.equalsIgnoreCase("a")||answer.equalsIgnoreCase("b")||answer.equalsIgnoreCase("c")||answer.equalsIgnoreCase("d"))
				{
                flag=false;
				
				}
				else
				{	
                System.out.print("Please Enter Valid Input=");
				}}
                    if (answer.equalsIgnoreCase("A")) {
                        A.score++;
                    }
					  System.out.println("[Que-2]How much percentage of nitrogen does enviroment contains?");
                    System.out.println("A. 89%");
                    System.out.println("B. 78%");
                    System.out.println("C. 45%");
                    System.out.println("D. none");
					System.out.print("Answer=");
               flag=true;
				while(flag)
				{
				A.answer=sc.next();
				if(answer.equalsIgnoreCase("a")||answer.equalsIgnoreCase("b")||answer.equalsIgnoreCase("c")||answer.equalsIgnoreCase("d"))
				{
                flag=false;
				
				}
				else
				{	
                System.out.print("Please Enter Valid Input=");
				}}
                    if (answer.equalsIgnoreCase("b")) {
                        A.score++;
                    }
					System.out.println("[Que-3]Three R are in enviroment ?");
                    System.out.println("A. Reduce");
                    System.out.println("B. Recycle");
                    System.out.println("C. Reuse");
                    System.out.println("D. a,b,c");
					System.out.print("Answer=");
                      flag=true;
				while(flag)
				{
				A.answer=sc.next();
				if(answer.equalsIgnoreCase("a")||answer.equalsIgnoreCase("b")||answer.equalsIgnoreCase("c")||answer.equalsIgnoreCase("d"))
				{
                flag=false;
				
				}
				else
				{	
                System.out.print("Please Enter Valid Input=");
				}}
                    if (answer.equalsIgnoreCase("d")) {
                        A.score++;
                    }
					System.out.println("[Que-4]  How much oxygen Are there in enviroment ?");
                    System.out.println("A. 21%");
                    System.out.println("B. 78%");
                    System.out.println("C. 56%");
                    System.out.println("D. none");
					System.out.print("Answer=");
                                     flag=true;
				while(flag)
				{
				A.answer=sc.next();
				if(answer.equalsIgnoreCase("a")||answer.equalsIgnoreCase("b")||answer.equalsIgnoreCase("c")||answer.equalsIgnoreCase("d"))
				{
                flag=false;
				
				}
				else
				{	
                System.out.print("Please Enter Valid Input=");
				}}
                    if (answer.equalsIgnoreCase("a")) {
                        A.score++;
                    }
					System.out.println("[Que-5] Enviroment means");
                    System.out.println("A. Surroundings");
                    System.out.println("B. admire");
                    System.out.println("C. Disppersion");
                    System.out.println("D. None");
                    System.out.print("Answer=");
                                     flag=true;
				while(flag)
				{
				A.answer=sc.next();
				if(answer.equalsIgnoreCase("a")||answer.equalsIgnoreCase("b")||answer.equalsIgnoreCase("c")||answer.equalsIgnoreCase("d"))
				{
                flag=false;
				
				}
				else
				{	
                System.out.print("Please Enter Valid Input=");
				}}
                    if (answer.equalsIgnoreCase("A")) {
                        A.score++;
                    }
					 EndTimeOfQuizzie = System.currentTimeMillis();
         		 TotalTimeTaken = EndTimeOfQuizzie - StartTimeOfQuizzie;
				 TotalQuizzieSeconds = TotalTimeTaken/ 1000;
				 StartTimeOfQuizzie=0;
			 if(TotalQuizzieSeconds>30)
				 {
					 System.out.println("Sorry to say "+UserId+"But Your total time taken to attempt this quiz is "+TotalQuizzieSeconds+"seconds which is more than 30 seconds\ndon't worry - take your time and try to improve your speed on the next question. Remember, practice makes perfect, and every question is an opportunity to learn and grow. Good luck and have fun!");
				 }
				 else
				 {
					 System.out.println("Great job ..!"+UserId+"\nYou have done fantasic Work Your total time taken to attempt this quiz is "+TotalQuizzieSeconds);
				 }
					break;
					
		default:
		System.out.println("Sorry your session is terminated because of invalid input please enter again");
		A.TopicList();
		A.TakeTopicInput(A);
		A.Questions(A);
			
	}
     break;
	 case 2:
	 switch(A.Topic){
		 case 1:
		 StartTimeOfQuizzie=System.currentTimeMillis();
	 System.out.println("[Que-1]What is the sum of 130+125+191+1000?");
                    System.out.println("A. 335");
                    System.out.println("B. 789");
                    System.out.println("C. 4460");
                    System.out.println("D. 789");
					System.out.print("Answer=");
                                     flag=true;
				while(flag)
				{
				A.answer=sc.next();
				if(answer.equalsIgnoreCase("a")||answer.equalsIgnoreCase("b")||answer.equalsIgnoreCase("c")||answer.equalsIgnoreCase("d"))
				{
                flag=false;
				
				}
				else
				{	
                System.out.print("Please Enter Valid Input=");
				}}
                    if (answer.equalsIgnoreCase("C")) {
                       A.score++;
                    }
                    System.out.println("[Que-2]50 times of 1045 is equal to:");
                    System.out.println("A. 100000");
                    System.out.println("B. 52250");
                    System.out.println("C. 78900");
                    System.out.println("D. 564");
					System.out.print("Answer=");
                     flag=true;
				while(flag)
				{
				A.answer=sc.next();
				if(answer.equalsIgnoreCase("a")||answer.equalsIgnoreCase("b")||answer.equalsIgnoreCase("c")||answer.equalsIgnoreCase("d"))
				{
                flag=false;
				
				}
				else
				{	
                System.out.print("Please Enter Valid Input=");
				}}
                    if (answer.equalsIgnoreCase("B")) {
                        A.score++;
                    }
					 System.out.println("[Que-3]87022 Minus 100 is equal to:");
                    System.out.println("A. 45612");
                    System.out.println("B. 86922");
                    System.out.println("C. 90100");
                    System.out.println("D. 5400");
					System.out.print("Answer=");
                        flag=true;
				while(flag)
				{
				A.answer=sc.next();
				if(answer.equalsIgnoreCase("a")||answer.equalsIgnoreCase("b")||answer.equalsIgnoreCase("c")||answer.equalsIgnoreCase("d"))
				{
                flag=false;
				
				}
				else
				{	
                System.out.print("Please Enter Valid Input=");
				}}
                    if (answer.equalsIgnoreCase("B")) {
                        A.score++;
                    }
					System.out.println("[Que-4]7000 Multiply by 100 is equal to:");
                    System.out.println("A. 700000");
                    System.out.println("B. 700");
                    System.out.println("C. 770");
                    System.out.println("D. 789");
					System.out.print("Answer=");
                                      flag=true;
				while(flag)
				{
				A.answer=sc.next();
				if(answer.equalsIgnoreCase("a")||answer.equalsIgnoreCase("b")||answer.equalsIgnoreCase("c")||answer.equalsIgnoreCase("d"))
				{
                flag=false;
				
				}
				else
				{	
                System.out.print("Please Enter Valid Input=");
				}}
                    if (answer.equalsIgnoreCase("A")) {
                        A.score++;
                    }
					System.out.println("[Que-5]45000 divide by 100 is equal to:");
                    System.out.println("A. 0.45");
                    System.out.println("B. 0.045");
                    System.out.println("C. 01230");
                    System.out.println("D. 450");
					System.out.print("Answer=");
                                      flag=true;
				while(flag)
				{
				A.answer=sc.next();
				if(answer.equalsIgnoreCase("a")||answer.equalsIgnoreCase("b")||answer.equalsIgnoreCase("c")||answer.equalsIgnoreCase("d"))
				{
                flag=false;
				
				}
				else
				{	
                System.out.print("Please Enter Valid Input=");
				}}
                    if (answer.equalsIgnoreCase("d")) {
                        A.score++;
                    }
					 EndTimeOfQuizzie = System.currentTimeMillis();
         		  TotalTimeTaken = EndTimeOfQuizzie - StartTimeOfQuizzie;
				  TotalQuizzieSeconds = TotalTimeTaken/ 1000;
				   StartTimeOfQuizzie=0;
				  if(TotalQuizzieSeconds>30)
				 {
					 System.out.println("Sorry to say "+UserId+"But Your total time taken to attempt this quiz is "+TotalQuizzieSeconds+"seconds which is more than 30 seconds don't worry - take your time and try to improve your speed on the next question. Remember, practice makes perfect, and every question is an opportunity  to learn and grow. Good luck and have fun!");
				 }
				 else
				 {
					 System.out.println("Great job ..!"+UserId+"\nYou have done fantasic Work Your total time taken to attempt this quiz is "+TotalQuizzieSeconds);
				 }
		break;
		case 2:
		StartTimeOfQuizzie=System.currentTimeMillis();
		System.out.println("Here We Start your phy game");
		  System.out.println("[Que-1]A ball is thrown vertically upwards with an initial velocity of 20 m/s.\nWhat is its maximum height above its starting point? (Assume no air resistance and a gravitational acceleration of 9.8 m/s^2) ?");
                    System.out.println("A. 40\nB. 20\nC. 100\nD. None"); 
                   System.out.print("Answer=");
					    flag=true;
				while(flag)
				{
				A.answer=sc.next();
				if(answer.equalsIgnoreCase("a")||answer.equalsIgnoreCase("b")||answer.equalsIgnoreCase("c")||answer.equalsIgnoreCase("d"))
				{
                flag=false;
				
				}
				else
				{	
                System.out.print("Please Enter Valid Input=");
				}}
                    if (answer.equalsIgnoreCase("A")) {
                        A.score++;
                    }
                    System.out.println("[Que-2]What is the SI unit of force?");
                    System.out.println("A. pascal\nB. coloumb\nC. watt\nD. Newton");
					System.out.print("Answer=");
                                       flag=true;
				while(flag)
				{
				A.answer=sc.next();
				if(answer.equalsIgnoreCase("a")||answer.equalsIgnoreCase("b")||answer.equalsIgnoreCase("c")||answer.equalsIgnoreCase("d"))
				{
                flag=false;
				
				}
				else
				{	
                System.out.print("Please Enter Valid Input=");
				}}
                    if (answer.equalsIgnoreCase("d")) {
                        A.score++;
                    }
					System.out.println("[Que-3]What is the SI unit of electric charge??");
                   System.out.println("A. pascal\nB. coloumb \nC. watt\nD. Newton");
				   System.out.print("Answer=");
                                          flag=true;
				while(flag)
				{
				A.answer=sc.next();
				if(answer.equalsIgnoreCase("a")||answer.equalsIgnoreCase("b")||answer.equalsIgnoreCase("c")||answer.equalsIgnoreCase("d"))
				{
                flag=false;
				
				}
				else
				{	
                System.out.print("Please Enter Valid Input=");
				}}
                    if (answer.equalsIgnoreCase("B")) {
                        A.score++;
                    }
					System.out.println("[Que-4]What is the formula for calculating power?");
                   System.out.println("A. pascal/f\nB. coloumb/m \nC. mv^2/2\nD. W/t");
					System.out.print("Answer=");
                     flag=true;
				while(flag)
				{
				A.answer=sc.next();
				if(answer.equalsIgnoreCase("a")||answer.equalsIgnoreCase("b")||answer.equalsIgnoreCase("c")||answer.equalsIgnoreCase("d"))
				{
                flag=false;
				
				}
				else
				{	
                System.out.print("Please Enter Valid Input=");
				}}
                    if (answer.equalsIgnoreCase("D")) {
                        A.score++;
                    }
					System.out.println("[Que-5] What is the formula for calculating electric potential difference?");
                     System.out.println("A. V = IR\nB.  V = Ed/m \nC. mv^2/2\nD. W/t");
					System.out.print("Answer=");
                       flag=true;
				while(flag)
				{
				A.answer=sc.next();
				if(answer.equalsIgnoreCase("a")||answer.equalsIgnoreCase("b")||answer.equalsIgnoreCase("c")||answer.equalsIgnoreCase("d"))
				{
                flag=false;
				
				}
				else
				{	
                System.out.print("Please Enter Valid Input=");
				}}
                    if (answer.equalsIgnoreCase("B")) {
                        A.score++;
                    }
					 EndTimeOfQuizzie = System.currentTimeMillis();
         		  TotalTimeTaken = EndTimeOfQuizzie - StartTimeOfQuizzie;
				  TotalQuizzieSeconds = TotalTimeTaken/ 1000;
				   StartTimeOfQuizzie=0;
		 if(TotalQuizzieSeconds>30)
				 {
					 System.out.println("Sorry to say "+UserId+"But Your total time taken to attempt this quiz is "+TotalQuizzieSeconds+"seconds which is more than 30 seconds\ndon't worry - take your time and try to improve your speed on the next question. Remember, practice makes perfect, and every question is an opportunity to learn and grow. Good luck and have fun!");
				 }
				 else
				 {
					 System.out.println("Great job ..!"+UserId+"\nYou have done fantasic Work Your total time taken to attempt this quiz is "+TotalQuizzieSeconds);
				 }
						break;
						case 3:
						StartTimeOfQuizzie=System.currentTimeMillis();
						System.out.println("Here We Start your History Quiz");
		  System.out.println("[Que-1]Who was the first woman to become the Prime Minister of India?");
                     System.out.println("A. IndiraGadhi\nB. Ravina \nC. LaxmiBai \nD. krishana");
					System.out.print("Answer=");
                        flag=true;
				while(flag)
				{
				A.answer=sc.next();
				if(answer.equalsIgnoreCase("a")||answer.equalsIgnoreCase("b")||answer.equalsIgnoreCase("c")||answer.equalsIgnoreCase("d"))
				{
                flag=false;
				
				}
				else
				{	
                System.out.print("Please Enter Valid Input=");
				}}
                    if (answer.equalsIgnoreCase("A")) {
                        A.score++;
                    }
                       System.out.println("[Que-2]Who is first President of india");
                     System.out.println("A. Dr. Rajendra Prasad\nB. Dr. Sarvepalli Radhakrishnan \nC. Dr. Zakir Hussain\nD. V. V. Giri");
                    	System.out.print("Answer=");
					                   flag=true;
				while(flag)
				{
				A.answer=sc.next();
				if(answer.equalsIgnoreCase("a")||answer.equalsIgnoreCase("b")||answer.equalsIgnoreCase("c")||answer.equalsIgnoreCase("d"))
				{
                flag=false;
				
				}
				else
				{	
                System.out.print("Please Enter Valid Input=");
				}}
                    if (answer.equalsIgnoreCase("a")) {
                        A.score++;
                    }
					System.out.println("[Que-3]Who was the first woman to receive the Bharat Ratna, India's highest civilian award??");
                     System.out.println("A. Mother Teresa \nB. Indira Gandhi\nC. Sarojini Naidu\nD. Lata Mangeshkar");
					System.out.print("Answer=");
                                      flag=true;
				while(flag)
				{
				A.answer=sc.next();
				if(answer.equalsIgnoreCase("a")||answer.equalsIgnoreCase("b")||answer.equalsIgnoreCase("c")||answer.equalsIgnoreCase("d"))
				{
                flag=false;
				
				}
				else
				{	
                System.out.print("Please Enter Valid Input=");
				}}
                    if (answer.equalsIgnoreCase("c")) {
                        A.score++;
                    }
					System.out.println("[Que-4] kWho was the first Indian to receive the Nobel Prize?");
                       System.out.println("A. Mother Teresa \nB. Rabindranath Tagore\nC. Sarojini Naidu\nD. Lata Mangeshkar");
					System.out.print("Answer=");
                                     flag=true;
				while(flag)
				{
				A.answer=sc.next();
				if(answer.equalsIgnoreCase("a")||answer.equalsIgnoreCase("b")||answer.equalsIgnoreCase("c")||answer.equalsIgnoreCase("d"))
				{
                flag=false;
				
				}
				else
				{	
                System.out.print("Please Enter Valid Input=");
				}}
                    if (answer.equalsIgnoreCase("B")) {
                        A.score++;
                    }
					System.out.println("[Que-5] Who played key role in the integration of princely states into independent India?");
                   System.out.println("A. Sardar Vallabhbhai Patel \nB.  Rabindranath Tagore\nC. Sarojini Naidu\nD. Lata Mangeshkar");
					System.out.print("Answer=");
                                       flag=true;
				while(flag)
				{
				A.answer=sc.next();
				if(answer.equalsIgnoreCase("a")||answer.equalsIgnoreCase("b")||answer.equalsIgnoreCase("c")||answer.equalsIgnoreCase("d"))
				{
                flag=false;
				
				}
				else
				{	
                System.out.print("Please Enter Valid Input=");
				}}
                    if (answer.equalsIgnoreCase("A")) {
                        A.score++;
                    }
				 EndTimeOfQuizzie = System.currentTimeMillis();
         		 TotalTimeTaken = EndTimeOfQuizzie - StartTimeOfQuizzie;
				 TotalQuizzieSeconds = TotalTimeTaken/ 1000;
				  StartTimeOfQuizzie=0;
				 if(TotalQuizzieSeconds>30)
				 {
					 System.out.println("Sorry to say "+UserId+"But Your total time taken to attempt this quiz is "+TotalQuizzieSeconds+"seconds which is more than 30 seconds\ndon't worry - take your time and try to improve your speed on the next question. Remember, practice makes perfect, and every question is an opportunity to learn and grow. Good luck and have fun!");
				 }
				 else
				 {
					 System.out.println("Great job ..!"+UserId+"\nYou have done fantasic Work Your total time taken to attempt this quiz is "+TotalQuizzieSeconds);
				 }
					break;
					case 4:
					StartTimeOfQuizzie=System.currentTimeMillis();
					System.out.println("Here We Start your BollywoodRelatedQuiz");
					  System.out.println("[Que-1] Who is known as the King of Bollywood?");
                     System.out.println("A. Shah Rukh Khan\nB. Salman khan \nC. Aamir Khan \nD. Akshay Kumar");
					System.out.print("Answer=");
                     flag=true;
				while(flag)
				{
				A.answer=sc.next();
				if(answer.equalsIgnoreCase("a")||answer.equalsIgnoreCase("b")||answer.equalsIgnoreCase("c")||answer.equalsIgnoreCase("d"))
				{
                flag=false;
				
				}
				else
				{	
                System.out.print("Please Enter Valid Input=");
				}}
                    if (answer.equalsIgnoreCase("A")) {
                        A.score++;
                    }
                       System.out.println("[Que-2]Who played the lead role in the movie Dilwale Dulhania Le Jayenge?"); 
					   System.out.println("A. Shah Rukh Khan\nB. Salman khan \nC. Aamir Khan \nD. Akshay Kumar");
						System.out.print("Answer=");
						  flag=true;
				while(flag)
				{
				A.answer=sc.next();
				if(answer.equalsIgnoreCase("a")||answer.equalsIgnoreCase("b")||answer.equalsIgnoreCase("c")||answer.equalsIgnoreCase("d"))
				{
                flag=false;
				
				}
				else
				{	
                System.out.print("Please Enter Valid Input=");
				}}
                    if (answer.equalsIgnoreCase("a")) {
                        A.score++;
                    }
					System.out.println("[Que-3]WWho is the Father of Bollywood actor Abhishek Bachchan?");
                     System.out.println("A. Shah Rukh Khan\nB. Salman khan \nC. Amitabhji \nD. Akshay Kumar");
					System.out.print("Answer=");
			flag=true;
				while(flag)
				{
				A.answer=sc.next();
				if(answer.equalsIgnoreCase("a")||answer.equalsIgnoreCase("b")||answer.equalsIgnoreCase("c")||answer.equalsIgnoreCase("d"))
				{
                flag=false;
				
				}
				else
				{	
                System.out.print("Please Enter Valid Input=");
				}}
                    if (answer.equalsIgnoreCase("c")) {
                        A.score++;
                    }
					System.out.println("[Que-4] Which actor has won the most Filmfare Awards for Best Actor?");
					System.out.println("A. Shah Rukh Khan\nB. Salman khan \nC. Amitabhji \nD. Akshay Kumar");
					System.out.print("Answer=");
                      flag=true;
				while(flag)
				{
				A.answer=sc.next();
				if(answer.equalsIgnoreCase("a")||answer.equalsIgnoreCase("b")||answer.equalsIgnoreCase("c")||answer.equalsIgnoreCase("d"))
				{
                flag=false;
				
				}
				else
				{	
                System.out.print("Please Enter Valid Input=");
				}}
                    if (answer.equalsIgnoreCase("c")) {
                        A.score++;
                    }
					System.out.println("[Que-5] Who is the director of the movie Bajirao Mastani?");
                System.out.println("A. Sanjay Leela Bhansali\nB. Salman khan \nC. Amitabhji \nD. Akshay Kumar");
					System.out.print("Answer=");
                  flag=true;
				while(flag)
				{
				A.answer=sc.next();
				if(answer.equalsIgnoreCase("a")||answer.equalsIgnoreCase("b")||answer.equalsIgnoreCase("c")||answer.equalsIgnoreCase("d"))
				{
                flag=false;
				
				}
				else
				{	
                System.out.print("Please Enter Valid Input=");
				}}
                    if (answer.equalsIgnoreCase("A")) {
                        A.score++;
                    }
				 EndTimeOfQuizzie = System.currentTimeMillis();
         		 TotalTimeTaken = EndTimeOfQuizzie - StartTimeOfQuizzie;
				 TotalQuizzieSeconds = TotalTimeTaken/ 1000;
				  StartTimeOfQuizzie=0;
				 if(TotalQuizzieSeconds>30)
				 {
					 System.out.println("Sorry to say "+UserId+"But Your total time taken to attempt this quiz is "+TotalQuizzieSeconds+"seconds which is more than 30 seconds\ndon't worry - take your time and try to improve your speed on the next question. Remember, practice makes perfect, and every question is an opportunity to learn and grow. Good luck and have fun!");
				 }
				 else
				 {
					 System.out.println("Great job ..!"+UserId+"\nYou have done fantasic Work Your total time taken to attempt this quiz is "+TotalQuizzieSeconds);
				 }
					break;
					case 5:
					StartTimeOfQuizzie=System.currentTimeMillis();
					System.out.println("Here We Start your MythologicalQuiz");
					System.out.println("[Que-1] WWho is the tenth avatar of Vishnu in Hindu mythology?");
                     System.out.println("A. krishana\nB. kalki\nC. Ganesha\nD. Laxmi");
					System.out.print("Answer=");
                     flag=true;
				while(flag)
				{
				A.answer=sc.next();
				if(answer.equalsIgnoreCase("a")||answer.equalsIgnoreCase("b")||answer.equalsIgnoreCase("c")||answer.equalsIgnoreCase("d"))
				{
                flag=false;
				
				}
				else
				{	
                System.out.print("Please Enter Valid Input=");
				}}
                    if (answer.equalsIgnoreCase("b")) {
                        A.score++;
                    }
                       System.out.println("[Que-2]Who is the goddess of wealth and prosperity in Hindu mythology?"); 
						System.out.println("A. krishana\nB. kalki\nC. Ganesha\nD. Laxmi");
						System.out.print("Answer=");
				        flag=true;
				while(flag)
				{
				A.answer=sc.next();
				if(answer.equalsIgnoreCase("a")||answer.equalsIgnoreCase("b")||answer.equalsIgnoreCase("c")||answer.equalsIgnoreCase("d"))
				{
                flag=false;
				
				}
				else
				{	
                System.out.print("Please Enter Valid Input=");
				}}
                    if (answer.equalsIgnoreCase("d")) {
                        A.score++;
                    }
					System.out.println("[Que-3]Who is the demon king and primary antagonist in the Hindu epic Ramayana??");
                     System.out.println("A. krishana\nB. kalki\nC. Ganesha\nD. Ravan");
					System.out.print("Answer=");
                  flag=true;
				while(flag)
				{
				A.answer=sc.next();
				if(answer.equalsIgnoreCase("a")||answer.equalsIgnoreCase("b")||answer.equalsIgnoreCase("c")||answer.equalsIgnoreCase("d"))
				{
                flag=false;
				
				}
				else
				{	
                System.out.print("Please Enter Valid Input=");
				}}
                    if (answer.equalsIgnoreCase("d")) {
                        A.score++;
                    }
					System.out.println("[Que-4]Who is the god of wisdom, knowledge and new beginnings in Hindu mythology?");
					System.out.println("A. krishana\nB. kalki\nC. Ganesha\nD. Brahma");
					System.out.print("Answer=");
                   flag=true;
				while(flag)
				{
				A.answer=sc.next();
				if(answer.equalsIgnoreCase("a")||answer.equalsIgnoreCase("b")||answer.equalsIgnoreCase("c")||answer.equalsIgnoreCase("d"))
				{
                flag=false;
				
				}
				else
				{	
                System.out.print("Please Enter Valid Input=");
				}}
                    if (answer.equalsIgnoreCase("d")) {
                        A.score++;
                    }
					System.out.println("[Que-5] In Hindu mythology, who is the god of destruction and transformation?");
                      System.out.println("A. krishana\nB. kalki\nC. Ganesha\nD. Brahma");
					System.out.print("Answer=");
                    flag=true;
				while(flag)
				{
				A.answer=sc.next();
				if(answer.equalsIgnoreCase("a")||answer.equalsIgnoreCase("b")||answer.equalsIgnoreCase("c")||answer.equalsIgnoreCase("d"))
				{
                flag=false;
				
				}
				else
				{	
                System.out.print("Please Enter Valid Input=");
				}}
                    if (answer.equalsIgnoreCase("c")) {
                        A.score++;
                    }
				 EndTimeOfQuizzie = System.currentTimeMillis();
         		 TotalTimeTaken = EndTimeOfQuizzie - StartTimeOfQuizzie;
				 TotalQuizzieSeconds = TotalTimeTaken/ 1000;
				  StartTimeOfQuizzie=0;
				 if(TotalQuizzieSeconds>30)
				 {
					 System.out.println("Sorry to say "+UserId+"But Your total time taken to attempt this quiz is "+TotalQuizzieSeconds+"seconds which is more than 30 seconds\ndon't worry - take your time and try to improve your speed on the next question. Remember, practice makes perfect, and every question is an opportunity to learn and grow. Good luck and have fun!");
				 }
				 else
				 {
					 System.out.println("Great job ..!"+UserId+"\nYou have done fantasic Work Your total time taken to attempt this quiz is "+TotalQuizzieSeconds);
				 }
					break;
					case 6:
					StartTimeOfQuizzie=System.currentTimeMillis();
					System.out.println("Here We Start your EnvironmentalQuiz");
					  System.out.println("[Que-1] What is the primary cause of global warming?");
                     System.out.println("A. Burning of fossil fuels\nB. fossil fuel\nC. none\nD. Both");
					System.out.print("Answer=");
                    flag=true;
				while(flag)
				{
				A.answer=sc.next();
				if(answer.equalsIgnoreCase("a")||answer.equalsIgnoreCase("b")||answer.equalsIgnoreCase("c")||answer.equalsIgnoreCase("d"))
				{
                flag=false;
				
				}
				else
				{	
                System.out.print("Please Enter Valid Input=");
				}}
                    if (answer.equalsIgnoreCase("A")) {
                        A.score++;
                    }
                       System.out.println("[Que-2]What is the largest source of water pollution in the world?"); 
					           System.out.println("A. Sewage and wastewater\nB. fossil fuel\nC. none\nD. Both");
                 System.out.print("Answer=");
				    flag=true;
				while(flag)
				{
				A.answer=sc.next();
				if(answer.equalsIgnoreCase("a")||answer.equalsIgnoreCase("b")||answer.equalsIgnoreCase("c")||answer.equalsIgnoreCase("d"))
				{
                flag=false;
				
				}
				else
				{	
                System.out.print("Please Enter Valid Input=");
				}}
                    if (answer.equalsIgnoreCase("a")) {
                        A.score++;
                    }
					System.out.println("[Que-3]What is the process by which plants convert light energy into chemical energy?");
					System.out.println("A. Sewage and wastewater\nB. fossil fuel\nC. none\nD. Photosynthesis");
					System.out.print("Answer=");
                        flag=true;
				while(flag)
				{
				A.answer=sc.next();
				if(answer.equalsIgnoreCase("a")||answer.equalsIgnoreCase("b")||answer.equalsIgnoreCase("c")||answer.equalsIgnoreCase("d"))
				{
                flag=false;
				
				}
				else
				{	
                System.out.print("Please Enter Valid Input=");
				}}
                    if (answer.equalsIgnoreCase("D")) {
                        A.score++;
                    }
					System.out.println("[Que-4]What is the largest rainforest in the world?");
					System.out.println("A. Amazon rainforest\nB. katoriin\nC. none\nD. Both");
					System.out.print("Answer=");
                      flag=true;
				while(flag)
				{
				A.answer=sc.next();
				if(answer.equalsIgnoreCase("a")||answer.equalsIgnoreCase("b")||answer.equalsIgnoreCase("c")||answer.equalsIgnoreCase("d"))
				{
                flag=false;
				
				}
				else
				{	
                System.out.print("Please Enter Valid Input=");
				}}
                    if (answer.equalsIgnoreCase("a")) {
                        A.score++;
                    }
					System.out.println("[Que-5] What is the name of the process by which soil loses its fertility due to excessive use of chemical fertilizers?");
                   System.out.println("A. Sewage and wastewater\nB. fossil fuel\nC. Soil degradation\nD.Photosynthesis");
					System.out.print("Answer=");
                      flag=true;
				while(flag)
				{
				A.answer=sc.next();
				if(answer.equalsIgnoreCase("a")||answer.equalsIgnoreCase("b")||answer.equalsIgnoreCase("c")||answer.equalsIgnoreCase("d"))
				{
                flag=false;
				
				}
				else
				{	
                System.out.print("Please Enter Valid Input=");
				}}
                    if (answer.equalsIgnoreCase("c")) {
                        A.score++;
                    }
				 EndTimeOfQuizzie = System.currentTimeMillis();
         		 TotalTimeTaken = EndTimeOfQuizzie - StartTimeOfQuizzie;
				 TotalQuizzieSeconds = TotalTimeTaken/ 1000;
				  StartTimeOfQuizzie=0;
 if(TotalQuizzieSeconds>30)
				 {
					 System.out.println("Sorry to say "+UserId+"But Your total time taken to attempt this quiz is "+TotalQuizzieSeconds+"seconds which is more than 30 seconds\ndon't worry - take your time and try to improve your speed on the next question. Remember, practice makes perfect, and every question is an opportunity to learn and grow. Good luck and have fun!");
				 }
				 else
				 {
					 System.out.println("Great job ..!"+UserId+"\nYou have done fantasic Work Your total time taken to attempt this quiz is "+TotalQuizzieSeconds);
				 }					break;
					
					default:
				System.out.println("Sorry your session is terminated because of invalid input please enter again");
		        A.TopicList();
				A.TakeTopicInput(A);
				A.Questions(A);
				break;
	 }
	               break;
					default:
				System.out.println("Sorry your session is terminated because of invalid input please enter again");
					A.TopicList();
					A.TakeTopicInput(A);
					A.DifficultyLevel(A);
					A.Questions(A);
					A.PrintResult(A);
			break;
				
	}
	
	}
	void PrintResult(Quizzie A)
	{
	if(A.score==0||A.score==1||A.score==2)
	{
		System.out.println("Sorry to say but your Quizzie points is "+A.score+"\nDon't get discouraged - you can always try again!Take some time to review the questions and answers,and use this as an opportunity to learn and improve your skills Remember, success is not just about getting the answers right, \nbut also about the effort and learning that goes into it. So keep practicing and you will improve. Good luck on your next attempt!");
		System.out.println("Do You Want to Play Again Yes/NO ");
		Scanner sc=new Scanner(System.in);
			flag=true;
				while(flag)
				{
					A.Response=sc.next();
				if(Response.equalsIgnoreCase("yes")||Response.equalsIgnoreCase("no"))
				{
                flag=false;
				
				}
				else
				{	
                System.out.print("Please Enter Valid Input=");
				}}
	  if (Response.equalsIgnoreCase("YES")) 
					{
			A.score=0;
			A.TopicList();	
			A.TakeTopicInput(A);
			A.DifficultyLevel(A);
			A.Questions(A);
			A.PrintResult(A);
                    }
					else
					{
						
						System.out.println("Do You Wanna Rate Our Game To Improve US Yes/NO");
						
						  flag=true;
				while(flag)
				{
					Rate_response=sc.next();
				if(Rate_response.equalsIgnoreCase("yes")||Rate_response.equalsIgnoreCase("no"))
				{
                flag=false;
				
				}
				else
				{	
                System.out.print("Please Enter Valid Input=");
				}}
						 if (Rate_response.equalsIgnoreCase("YES"))
						 {
							 A.Rate();
						 }
						 else
						 {
								System.out.println("Thank You For Choosing Quizzie..!Hope To See You Again ");
						 }
					       
					}
	}
	else if(A.score==3||A.score==4)
	{
		System.out.println("Congratulation for clearing Quizzie's Quiz Succesfully");
		System.out.println("Your Quizzie Point is= "+A.score);
		System.out.println("Do You Want to Play Again Yes/NO ");
		Scanner sc=new Scanner(System.in);
	flag=true;
				while(flag)
				{
					A.Response=sc.next();
				if(Response.equalsIgnoreCase("yes")||Response.equalsIgnoreCase("no"))
				{
                flag=false;
				
				}
				else
				{	
                System.out.print("Please Enter Valid Input=");
				}}
		
	 if (Response.equalsIgnoreCase("YES")) 
					{
			A.score=0;
			A.TopicList();	
			A.TakeTopicInput(A);
			A.DifficultyLevel(A);
			A.Questions(A);
			A.PrintResult(A);
                    }
					else
					{
						
						System.out.println("Do You Wanna Rate Our Game To Improve US Yes/NO");
						 flag=true;
				while(flag)
				{
					Rate_response=sc.next();
				if(Rate_response.equalsIgnoreCase("yes")||Rate_response.equalsIgnoreCase("no"))
				{
                flag=false;
				
				}
				else
				{	
                System.out.print("Please Enter Valid Input=");
				}}
						 if (Rate_response.equalsIgnoreCase("YES"))
						 {
							 A.Rate();
						 }
						 else
						 {
								System.out.println("Thank You For Choosing Quizzie..!Hope To See You Again ");
						 }
					       
					}
	
	}
	else{
		System.out.println("You Won..!Congratulations you have carved a niche..!");
		System.out.println("Your Quizzie Point is= "+A.score);
		System.out.print("We are grateful to have a user like you\n");
		System.out.println("Do You Want to Play Again Yes/NO ");
		Scanner sc=new Scanner(System.in);
		flag=true;
				while(flag)
				{
					A.Response=sc.next();
				if(Response.equalsIgnoreCase("yes")||Response.equalsIgnoreCase("no"))
				{
                flag=false;
				
				}
				else
				{	
                System.out.print("Please Enter Valid Input=");
				}}
		if (Response.equalsIgnoreCase("YES")) {
		A.score=0;
		A.TopicList();
		sc.nextLine();
		A.TakeTopicInput(A);
		A.DifficultyLevel(A);
		A.Questions(A);
		A.PrintResult(A);
                    }
					else{
						System.out.println("Do You Wanna Rate Our Game To Improve US Yes/NO ");
						 flag=true;
				while(flag)
				{
					Rate_response=sc.next();
				if(Rate_response.equalsIgnoreCase("yes")||Rate_response.equalsIgnoreCase("no"))
				{
                flag=false;
				
				}
				else
				{	
                System.out.print("Please Enter Valid Input=");
				}}
						 if (Rate_response.equalsIgnoreCase("YES"))
						 {
							 A.Rate();
						 }
						 else
						 {
								System.out.println("Thank You For Choosing Quizzie..!Hope To See You Again ");
						 }
					}
			}
						}
}
				
	class QuizzieMain
	{
		public static void main(String[]args)
		{
			Quizzie obj=new Quizzie();
			obj.Instructions();
			obj.User(obj);
			obj.TopicList();
			obj.TakeTopicInput(obj);
			obj.DifficultyLevel(obj);
			obj.Questions(obj);
			obj.PrintResult(obj);
		}
	}
