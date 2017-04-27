import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.util.Random;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.AbstractAction;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.sun.org.apache.xml.internal.security.algorithms.implementations.IntegrityHmac;
import com.sun.xml.internal.ws.dump.LoggingDumpTube.Position;

import sun.audio.AudioData;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;
import sun.audio.ContinuousAudioDataStream;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.JButton;
import javax.swing.JComponent;

import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import java.awt.Color;

public class Main extends JFrame {
	private JPanel contentPane;
	private final JLabel lblBoard = new JLabel("New label");
	private JLabel lblDimage;
	private JLabel lblP1;
	private JButton btnDice;
	private JLabel lblPlayerName;
	private JLabel lbl91;
	private JLabel lbl92;
	private JLabel lbl93;
	private JLabel lbl94;
	private JLabel lbl95;
	private JLabel lbl96;
	private JLabel lbl97;
	private JLabel lbl98;
	private JLabel lbl100;
	private JLabel lbl99;
	private JLabel lbl90;
	private JLabel lbl89;
	private JLabel lbl88;
	private JLabel lbl87;
	private JLabel lbl86;
	private JLabel lbl85;
	private JLabel lbl84;
	private JLabel lbl83;
	private JLabel lbl81;
	private JLabel lbl82;
	private JLabel lbl71;
	private JLabel lbl72;
	private JLabel lbl73;
	private JLabel lbl74;
	private JLabel lbl75;
	private JLabel lbl76;
	private JLabel lbl77;
	private JLabel lbl78;
	private JLabel lbl80;
	private JLabel lbl79;
	private JLabel lbl70;
	private JLabel lbl69;
	private JLabel lbl68;
	private JLabel lbl67;
	private JLabel lbl66;
	private JLabel lbl65;
	private JLabel lbl64;
	private JLabel lbl63;
	private JLabel lbl61;
	private JLabel lbl62;
	private JLabel lbl51;
	private JLabel lbl52;
	private JLabel lbl53;
	private JLabel lbl54;
	private JLabel lbl55;
	private JLabel lbl56;
	private JLabel lbl57;
	private JLabel lbl58;
	private JLabel lbl60;
	private JLabel lbl59;
	private JLabel lbl50;
	private JLabel lbl49;
	private JLabel lbl48;
	private JLabel lbl47;
	private JLabel lbl46;
	private JLabel lbl45;
	private JLabel lbl44;
	private JLabel lbl43;
	private JLabel lbl41;
	private JLabel lbl42;
	private JLabel lbl31;
	private JLabel lbl32;
	private JLabel lbl33;
	private JLabel lbl34;
	private JLabel lbl35;
	private JLabel lbl36;
	private JLabel lbl37;
	private JLabel lbl38;
	private JLabel lbl40;
	private JLabel lbl39;
	private JLabel lbl30;
	private JLabel lbl29;
	private JLabel lbl28;
	private JLabel lbl27;
	private JLabel lbl26;
	private JLabel lbl25;
	private JLabel lbl24;
	private JLabel lbl23;
	private JLabel lbl21;
	private JLabel lbl22;
	private JLabel lbl11;
	private JLabel lbl12;
	private JLabel lbl13;
	private JLabel lbl14;
	private JLabel lbl15;
	private JLabel lbl16;
	private JLabel lbl17;
	private JLabel lbl18;
	private JLabel lbl20;
	private JLabel lbl19;
	private JLabel lbl10;
	private JLabel lbl9;
	private JLabel lbl8;
	private JLabel lbl7;
	private JLabel lbl6;
	private JLabel lbl5;
	private JLabel lbl4;
	private JLabel lbl3;
	private JLabel lbl2;
	private JLabel lbl1;
	private JLabel p1score;
	private JLabel lblP2;
	private JLabel p2score;
	private JButton btnRestart;
    private int flag1=0,winingPosition=0;



	private int player=1;    // running player er index.
	public int playerFlag=6;
	private int[] flag= new int[playerFlag];   // flag 1 hoile khela shuru korbe prottek player
	//private int[] location= new int[2];  // 2jon player er location thakbe.
	public int playerPos=4;
	private int[] playerposition= new int[playerPos]; //4jon player er position
	private int oldposition;   //player er ager position. karon amk ager position ta muche dite hobe
	private int point, score=0, f=0;
	private JLabel lblP3;
	private JLabel p3score;
	private JLabel lblP4;
	private JLabel p4score;
	private JLabel lblPlayer;
	private JLabel p1btn;
	private JLabel label;
	private JLabel label_1;
	private JLabel label_2;
	private int playerNo;
	private int bal=0;
	private int chokkarAaagerPosition=0,chokka=0;
	public String[] playerName;
	/**
	 * Launch the application.
	 */



	public static void main(String[] args) {                    //ekhane dhukar drkr nai :/
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}



	/**
	 * Create the frame.
	 */



	//point ta Random number create kore return kore. and dice er pic show kore
	public void Dice(){
		Random rn = new Random();

		point = rn.nextInt(6)+1;
		//point=chokkaTest();

		String dice = String.valueOf(point);
		String location = "/Image/dice "+dice+".jpg";
		lblDimage.setIcon(new ImageIcon(Main.class.getResource(location)));   //player er disk board e boshay

		if(point==1) flag[player-1]=1;      //gutir chal 1 hoile she khela shuru korte parbe
		if(flag[player-1]==1)movedisc();
		//System.out.println("Dice: "+dice);
		
	}
	

	 	public void Paint(int x, int y){
		//System.out.println("Paint from: "+x+" to "+y);
		new Thread() {
	        @Override
	        public void run() {
	            try {
	            	//btnDice.setEnabled(false);
	            	//btnDice.setVisible(false);
	            	Thread.sleep(500);
	            	for(int i=x; i<y; i++){
	            		//System.out.println("Paint Player after: "+p);
	            		RemoveImage(i);
	            		Thread.sleep(50);
		            	SetImage(i+1,player);
		                Thread.sleep(500);
	            	}
	            	//btnDice.setVisible(true);
	            	//btnDice.setEnabled(true);
	            } catch (InterruptedException ex) {
	                Thread.currentThread().interrupt();
	                JOptionPane.showMessageDialog(null, "Paint timer error!");
	            }

	        }
	    }.start();
	    
	    
	   ActionListener taskPerformer = new ActionListener() {
	        public void actionPerformed(ActionEvent evt) {
	                

	        }
	    };
	    javax.swing.Timer t = new javax.swing.Timer(1000, taskPerformer);
	    t.setRepeats(false);
	    t.start();
	}
	
	



	   //---------------------------disc move korate ei function
	
	public void movedisc(){
		
		//-----------------------------------------------------chokka uthle count baraitesi ar na uthle count 0---------//
		if(point==6){chokka++;
		
		}
        else chokka=0;
		
		if(chokka>0){
		chokkarAaagerPosition=playerposition[player-1];
		lblPlayer.setText(playerName[player-1]);
		 bal=1;
		 
		 colorChange(); //color change kori
		 
		}
		if(bal==1 & chokka==0){
			if(player==playerPos)lblPlayer.setText(playerName[0]);
			
	 		else lblPlayer.setText(playerName[player]);
			bal=0;
		}
		//---------------------------------------//
		if(playerposition[player-1]+point >100){   //player er position 100er beshi hoile ager jaygay e thakbe//
			playerposition[player-1]= playerposition[player-1] ;
		}	
		//------------3bar chokka uthle ager ghore pathaye dibe-------------//
		else if(chokka==3){
			playerposition[player-1]=chokkarAaagerPosition;
		}
		//------------------------------------------------------------------------------------------------------------------//
		
		
		else{
			

			
        int xa= playerposition[player-1];
		//RemoveImage(playerposition[player-1]);    //she ekhon notun position e jabe. ager ghor thaikka ore bair kore deye hocche  :(
		int ya= playerposition[player-1]+point;
		playerposition[player-1]+=point;              //tar ager position er sathe chal e asha man jog kortese
        for(int i=xa;i<ya;i++){
        	
        	
        	try {
        		RemoveImage(i);
        		Thread.sleep(50);
            	SetImage(i+1, player);
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }


		//SetImage(playerposition[player-1], player);      //jei jei player tar tar position e boshacche, chal e man pawar por

			
		SkipTest(playerposition[player-1]);    //shap e katse kina ba moi baia upore uthse kina dekhtese


		if(playerposition[player-1] != Skipper(playerposition[player-1])){     //jodi shap e kate ba moi paia jay tahole amader ja koroniyo
			RemoveImage(playerposition[player-1]);
			playerposition[player-1]=Skipper(playerposition[player-1]);
			SetImage(playerposition[player-1], player);
		}  
        

		winCheck();     //---win hoise kina test kore msg dibe-----//
		
		
		setScore();     //-------Score set korbe. and win hoile shei msg diye dibe//
		
		
		}

	}
	
	public void colorChange(){
		 if(player==4){
	 			lblPlayer.setForeground(new Color(0, 204, 255)); //1
	 		}
	 		if(player==1){
	 			lblPlayer.setForeground(new Color(255, 204, 0)); //4
	 		}
	 		if(player==2){
	 			lblPlayer.setForeground(new Color(255, 51, 102)); //3
	 		}
	 		if(player==3){
	 			
	 			lblPlayer.setForeground(new Color(204, 51, 204)); //2
	 		}
	}




	public void PositionCheck(int x){         //dhor dui jon ek ghor e gese.. ek jon bair hoia jawar shomoy jate arekjon na bair hoia jaite pare

		for(int i=0; i<playerPos; i++){
			if(playerposition[i] == x && playerposition[i] != 0 && player != i+1){
				SetImage(x, i+1);
				//JOptionPane.showMessageDialog(null	, "Player matched with player "+String.valueOf(i+1));
				//JOptionPane.showMessageDialog(null	, playerName[player]+"Player matched with player "+playerName[i]);
			}
		}
		//JOptionPane.showMessageDialog(null, "position check ok");

	}


   public void winCheck(){
	   
		if(playerposition[player-1]==100) winingPosition++;
		
		if(playerposition[player-1] ==100 && flag1==0){   //
			JOptionPane.showMessageDialog(null, "Player "+player+" won!!");
			flag1=1;
		}
	   
   }
   
   public void setScore(){
	   
		if(player==1){
			
			
			//
		
			if( winingPosition==playerPos) p1score.setText("Looser :P ");
			 else if(playerposition[player-1]==100) p1score.setText("Winner "+winingPosition);
			else p1score.setText(String.valueOf(playerposition[player-1]));	    //churi korte jate na psros tai score show koira ditese
		}
		
		else if(player==2){
		

			 if( winingPosition==playerPos) p2score.setText("Looser HaHA! ");
			 else if(playerposition[player-1]==100) p2score.setText("Winner "+winingPosition);
			else 
			p2score.setText(String.valueOf(playerposition[player-1]));	 	//score show
		
			
		}
		else if(player==3){
			
			 if ( winingPosition==playerPos) p3score.setText("Looser HaHA ");
			 else if(playerposition[player-1]==100) p3score.setText("Winner "+winingPosition);
				else 
				p3score.setText(String.valueOf(playerposition[player-1]));	 	//score show
		
			
		}
		else if(player==4){
	
			 if ( winingPosition==playerPos-1) p4score.setText("Looser HaHA ");
			 else if(playerposition[player-1]==100) p4score.setText("Winner "+winingPosition);
				else 
				p4score.setText(String.valueOf(playerposition[player-1]));	 	//score show
		}
	   
   }



	public Main()  {
		setTitle("Lethal ShapLudu");          //constructor
		FrameinMiddle();

        initialize();
        //music();
 



	}



/*
	    public static void music() 
	    {       
	        AudioPlayer MGP = AudioPlayer.player;
	        AudioStream BGM;
	        AudioData MD;

	        ContinuousAudioDataStream loop = null;

	        try
	        {
	            InputStream test = new FileInputStream(" ‪G:\\Let_Her_Go.mp3");
	           
	            BGM = new AudioStream(test);
	            AudioPlayer.player.start(BGM);
	            //MD = BGM.getData();
	            //loop = new ContinuousAudioDataStream(MD);

	        }
	        catch(FileNotFoundException e){
	            System.out.print(e.toString());
	        }
	        catch(IOException error)
	        {
	            System.out.print(error.toString());
	        }
	        MGP.start(loop);
	    }
*/
	
	

	/*
	 * Checks if a certain block has ladder or snake
	 */
	public void SkipTest(int score){              ///jOptionpane e show korbe shap katse kina ba moi paise kina
		if(score == 23 || score == 32  || score == 61  || score == 65 || score == 75 ){
			System.out.println("Ladder at "+score);
			JOptionPane.showMessageDialog(null, playerName[player-1]+" Climbed Ladder at "+String.valueOf(score));
		}
		else if(score == 21  ||score == 27 ||  score == 47 || score == 56  ||score == 74  || score == 90  || score == 99 ){
			System.out.println("Snake at "+score);
			JOptionPane.showMessageDialog(null, playerName[player-1]+" Eaten by Snake at "+String.valueOf(score));
		}
	}




	/*
	 * shap katle ba moi paile onno ghore jabe oi fucntion
	 */
	public int Skipper(int score){
		if(score == 21)
			return 2;
		else if(score == 27)
			return 15;
		else if(score == 23)
			return 42;
		else if(score == 32)
			return 51;

		else if(score == 47)
			return 29;
		else if(score == 56)
			return 37;
		else if(score == 61)
			return 79;
		else if(score == 65)
			return 84;
		else if(score == 74)
			return 46;
		else if(score == 90)
			return 52;
		else if(score == 75)
			return 96;
		else if(score == 99)
			return 41;

		else
			return score;

	}






	 // kono ghor thaikka image remove korar jonne eita
	public void RemoveImage(int x){
		//System.out.println("Remove Image at "+ String.valueOf(x));
		if(x == 1){
			lbl1.setVisible(false);
		}
		else if(x == 2){
			lbl2.setVisible(false);
		}
		else if(x == 3){
			lbl3.setVisible(false);
		}
		else if(x == 4){
			lbl4.setVisible(false);
		}
		else if(x == 5){
			lbl5.setVisible(false);
		}
		else if(x == 6){
			lbl6.setVisible(false);
		}
		else if(x == 7){
			lbl7.setVisible(false);
		}
		else if(x == 8){
			lbl8.setVisible(false);
		}
		else if(x == 9){
			lbl9.setVisible(false);
		}
		else if(x == 10){
			lbl10.setVisible(false);
		}
		else if(x == 11){
			lbl11.setVisible(false);
		}
		else if(x == 12){
			lbl12.setVisible(false);
		}
		else if(x == 13){
			lbl13.setVisible(false);/////she tonu r style a kotha bole
		}
		else if(x == 14){
			lbl14.setVisible(false);
		}
		else if(x == 15){
			lbl15.setVisible(false);
		}
		else if(x == 16){
			lbl16.setVisible(false);
		}
		else if(x == 17){
			lbl17.setVisible(false);
		}
		else if(x == 18){
			lbl18.setVisible(false);
		}
		else if(x == 19){
			lbl19.setVisible(false);
		}
		else if(x == 20){
			lbl20.setVisible(false);
		}
		else if(x == 21){
			lbl21.setVisible(false);
		}
		else if(x == 22){
			lbl22.setVisible(false);
		}
		else if(x == 23){
			lbl23.setVisible(false);
		}
		else if(x == 24){
			lbl24.setVisible(false);
		}
		else if(x == 25){
			lbl25.setVisible(false);
		}
		else if(x == 26){
			lbl26.setVisible(false);
		}
		else if(x == 27){
			lbl27.setVisible(false);
		}
		else if(x == 28){
			lbl28.setVisible(false);
		}
		else if(x == 29){
			lbl29.setVisible(false);
		}
		else if(x == 30){
			lbl30.setVisible(false);
		}
		else if(x == 31){
			lbl31.setVisible(false);
		}
		else if(x == 32){
			lbl32.setVisible(false);
		}
		else if(x == 33){
			lbl33.setVisible(false);
		}
		else if(x == 34){
			lbl34.setVisible(false);
		}
		else if(x == 35){
			lbl35.setVisible(false);
		}
		else if(x == 36){
			lbl36.setVisible(false);
		}
		else if(x == 37){
			lbl37.setVisible(false);
		}
		else if(x == 38){
			lbl38.setVisible(false);
		}
		else if(x == 39){
			lbl39.setVisible(false);
		}
		else if(x == 40){
			lbl40.setVisible(false);
		}
		else if(x == 41){
			lbl41.setVisible(false);
		}
		else if(x == 42){
			lbl42.setVisible(false);
		}
		else if(x == 43){
			lbl43.setVisible(false);
		}
		else if(x == 44){
			lbl44.setVisible(false);
		}
		else if(x == 45){
			lbl45.setVisible(false);
		}
		else if(x == 46){
			lbl46.setVisible(false);
		}
		else if(x == 47){
			lbl47.setVisible(false);
		}
		else if(x == 48){
			lbl48.setVisible(false);
		}
		else if(x == 49){
			lbl49.setVisible(false);
		}
		else if(x == 50){
			lbl50.setVisible(false);
		}


		else if(x == 51){
			lbl51.setVisible(false);
		}
		else if(x == 52){
			lbl52.setVisible(false);
		}
		else if(x == 53){
			lbl53.setVisible(false);
		}
		else if(x == 54){
			lbl54.setVisible(false);
		}
		else if(x == 55){
			lbl55.setVisible(false);
		}
		else if(x == 56){
			lbl56.setVisible(false);
		}
		else if(x == 57){
			lbl57.setVisible(false);
		}
		else if(x == 58){
			lbl58.setVisible(false);
		}
		else if(x == 59){
			lbl59.setVisible(false);
		}
		else if(x == 60){
			lbl60.setVisible(false);
		}

		else if(x == 61){
			lbl61.setVisible(false);
		}
		else if(x == 62){
			lbl62.setVisible(false);
		}
		else if(x == 63){
			lbl63.setVisible(false);
		}
		else if(x == 64){
			lbl64.setVisible(false);
		}
		else if(x == 65){
			lbl65.setVisible(false);
		}
		else if(x == 66){
			lbl66.setVisible(false);
		}
		else if(x == 67){
			lbl67.setVisible(false);
		}
		else if(x == 68){
			lbl68.setVisible(false);
		}
		else if(x == 69){
			lbl69.setVisible(false);
		}
		else if(x == 70){
			lbl70.setVisible(false);
		}

		else if(x == 71){
			lbl71.setVisible(false);
		}
		else if(x == 72){
			lbl72.setVisible(false);
		}
		else if(x == 73){
			lbl73.setVisible(false);
		}
		else if(x == 74){
			lbl74.setVisible(false);
		}
		else if(x == 75){
			lbl75.setVisible(false);
		}
		else if(x == 76){
			lbl76.setVisible(false);
		}
		else if(x == 77){
			lbl77.setVisible(false);
		}
		else if(x == 78){
			lbl78.setVisible(false);
		}
		else if(x == 79){
			lbl79.setVisible(false);
		}
		else if(x == 80){
			lbl80.setVisible(false);
		}

		else if(x == 81){
			lbl81.setVisible(false);
		}
		else if(x == 82){
			lbl82.setVisible(false);
		}
		else if(x == 83){
			lbl83.setVisible(false);
		}
		else if(x == 84){
			lbl84.setVisible(false);
		}
		else if(x == 85){
			lbl85.setVisible(false);
		}
		else if(x == 86){
			lbl86.setVisible(false);
		}
		else if(x == 87){
			lbl87.setVisible(false);
		}
		else if(x == 88){
			lbl88.setVisible(false);
		}
		else if(x == 89){
			lbl89.setVisible(false);
		}
		else if(x == 90){
			lbl90.setVisible(false);
		}

		else if(x == 91){
			lbl91.setVisible(false);
		}
		else if(x == 92){
			lbl92.setVisible(false);
		}
		else if(x == 93){
			lbl93.setVisible(false);
		}
		else if(x == 94){
			lbl94.setVisible(false);
		}
		else if(x == 95){
			lbl95.setVisible(false);
		}
		else if(x == 96){
			lbl96.setVisible(false);
		}
		else if(x == 97){
			lbl97.setVisible(false);
		}
		else if(x == 98){
			lbl98.setVisible(false);
		}
		else if(x == 99){
			lbl99.setVisible(false);
		}
		else if(x == 100){
			lbl100.setVisible(false);
		}


		PositionCheck(x);   //positionCheck method k call kortesi.. karon same position e koyjon ase chk korar jonne

		//nicher tukun bug fix korte help kore
		//JOptionPane.showMessageDialog(null, "remove image at "+String.valueOf(x)+" for player "+String.valueOf(player));
	}








	public void SetImage(int x, int pl){   //naam deikkhai bujha jay image set korar jonne eta


	    String p=String.valueOf(pl);

		String location = "/Image/Player "+p+".png";


		if(x == 1){
			lbl1.setVisible(true);
			lbl1.setIcon(new ImageIcon(Main.class.getResource(location)));
		}
		else if(x == 2){
			lbl2.setVisible(true);
			lbl2.setIcon(new ImageIcon(Main.class.getResource(location)));
		}
		else if(x == 3){
			lbl3.setVisible(true);
			lbl3.setIcon(new ImageIcon(Main.class.getResource(location)));
		}
		else if(x == 4){
			lbl4.setVisible(true);
			lbl4.setIcon(new ImageIcon(Main.class.getResource(location)));
		}
		else if(x == 5){
			lbl5.setVisible(true);
			lbl5.setIcon(new ImageIcon(Main.class.getResource(location)));
		}
		else if(x == 6){
			lbl6.setVisible(true);
			lbl6.setIcon(new ImageIcon(Main.class.getResource(location)));
		}
		else if(x == 7){
			lbl7.setVisible(true);
			lbl7.setIcon(new ImageIcon(Main.class.getResource(location)));
		}
		else if(x == 8){
			lbl8.setVisible(true);
			lbl8.setIcon(new ImageIcon(Main.class.getResource(location)));
		}
		else if(x == 9){
			lbl9.setVisible(true);
			lbl9.setIcon(new ImageIcon(Main.class.getResource(location)));
		}
		else if(x == 10){
			lbl10.setVisible(true);
			lbl10.setIcon(new ImageIcon(Main.class.getResource(location)));
		}
		else if(x == 11){
			lbl11.setVisible(true);
			lbl11.setIcon(new ImageIcon(Main.class.getResource(location)));
		}
		else if(x == 12){
			lbl12.setVisible(true);
			lbl12.setIcon(new ImageIcon(Main.class.getResource(location)));
		}
		else if(x == 13){
			lbl13.setVisible(true);
			lbl13.setIcon(new ImageIcon(Main.class.getResource(location)));
		}
		else if(x == 14){
			lbl14.setVisible(true);
			lbl14.setIcon(new ImageIcon(Main.class.getResource(location)));
		}
		else if(x == 15){
			lbl15.setVisible(true);
			lbl15.setIcon(new ImageIcon(Main.class.getResource(location)));
		}
		else if(x == 16){
			lbl16.setVisible(true);
			lbl16.setIcon(new ImageIcon(Main.class.getResource(location)));
		}
		else if(x == 17){
			lbl17.setVisible(true);
			lbl17.setIcon(new ImageIcon(Main.class.getResource(location)));
		}
		else if(x == 18){
			lbl18.setVisible(true);
			lbl18.setIcon(new ImageIcon(Main.class.getResource(location)));
		}
		else if(x == 19){
			lbl19.setVisible(true);
			lbl19.setIcon(new ImageIcon(Main.class.getResource(location)));
		}
		else if(x == 20){
			lbl20.setVisible(true);
			lbl20.setIcon(new ImageIcon(Main.class.getResource(location)));
		}
		else if(x == 21){
			lbl21.setVisible(true);
			lbl21.setIcon(new ImageIcon(Main.class.getResource(location)));
		}
		else if(x == 22){
			lbl22.setVisible(true);
			lbl22.setIcon(new ImageIcon(Main.class.getResource(location)));
		}
		else if(x == 23){
			lbl23.setVisible(true);
			lbl23.setIcon(new ImageIcon(Main.class.getResource(location)));
		}
		else if(x == 24){
			lbl24.setVisible(true);
			lbl24.setIcon(new ImageIcon(Main.class.getResource(location)));
		}
		else if(x == 25){
			lbl25.setVisible(true);
			lbl25.setIcon(new ImageIcon(Main.class.getResource(location)));
		}
		else if(x == 26){
			lbl26.setVisible(true);
			lbl26.setIcon(new ImageIcon(Main.class.getResource(location)));
		}
		else if(x == 27){
			lbl27.setVisible(true);
			lbl27.setIcon(new ImageIcon(Main.class.getResource(location)));
		}
		else if(x == 28){
			lbl28.setVisible(true);
			lbl28.setIcon(new ImageIcon(Main.class.getResource(location)));
		}
		else if(x == 29){
			lbl29.setVisible(true);
			lbl29.setIcon(new ImageIcon(Main.class.getResource(location)));
		}
		else if(x == 30){
			lbl30.setVisible(true);
			lbl30.setIcon(new ImageIcon(Main.class.getResource(location)));
		}
		else if(x == 31){
			lbl31.setVisible(true);
			lbl31.setIcon(new ImageIcon(Main.class.getResource(location)));
		}
		else if(x == 32){
			lbl32.setVisible(true);
			lbl32.setIcon(new ImageIcon(Main.class.getResource(location)));
		}
		else if(x == 33){
			lbl33.setVisible(true);
			lbl33.setIcon(new ImageIcon(Main.class.getResource(location)));
		}
		else if(x == 34){
			lbl34.setVisible(true);
			lbl34.setIcon(new ImageIcon(Main.class.getResource(location)));
		}
		else if(x == 35){
			lbl35.setVisible(true);
			lbl35.setIcon(new ImageIcon(Main.class.getResource(location)));
		}
		else if(x == 36){
			lbl36.setVisible(true);
			lbl36.setIcon(new ImageIcon(Main.class.getResource(location)));
		}
		else if(x == 37){
			lbl37.setVisible(true);
			lbl37.setIcon(new ImageIcon(Main.class.getResource(location)));
		}
		else if(x == 38){
			lbl38.setVisible(true);
			lbl38.setIcon(new ImageIcon(Main.class.getResource(location)));
		}
		else if(x == 39){
			lbl39.setVisible(true);
			lbl39.setIcon(new ImageIcon(Main.class.getResource(location)));
		}
		else if(x == 40){
			lbl40.setVisible(true);
			lbl40.setIcon(new ImageIcon(Main.class.getResource(location)));
		}
		else if(x == 41){
			lbl41.setVisible(true);
			lbl41.setIcon(new ImageIcon(Main.class.getResource(location)));
		}
		else if(x == 42){
			lbl42.setVisible(true);
			lbl42.setIcon(new ImageIcon(Main.class.getResource(location)));
		}
		else if(x == 43){
			lbl43.setVisible(true);
			lbl43.setIcon(new ImageIcon(Main.class.getResource(location)));
		}
		else if(x == 44){
			lbl44.setVisible(true);
			lbl44.setIcon(new ImageIcon(Main.class.getResource(location)));
		}
		else if(x == 45){
			lbl45.setVisible(true);
			lbl45.setIcon(new ImageIcon(Main.class.getResource(location)));
		}
		else if(x == 46){
			lbl46.setVisible(true);
			lbl46.setIcon(new ImageIcon(Main.class.getResource(location)));
		}
		else if(x == 47){
			lbl47.setVisible(true);
			lbl47.setIcon(new ImageIcon(Main.class.getResource(location)));
		}
		else if(x == 48){
			lbl48.setVisible(true);
			lbl48.setIcon(new ImageIcon(Main.class.getResource(location)));
		}
		else if(x == 49){
			lbl49.setVisible(true);
			lbl49.setIcon(new ImageIcon(Main.class.getResource(location)));
		}
		else if(x == 50){
			lbl50.setVisible(true);
			lbl50.setIcon(new ImageIcon(Main.class.getResource(location)));
		}


		else if(x == 51){
			lbl51.setVisible(true);
			lbl51.setIcon(new ImageIcon(Main.class.getResource(location)));
		}
		else if(x == 52){
			lbl52.setVisible(true);
			lbl52.setIcon(new ImageIcon(Main.class.getResource(location)));
		}
		else if(x == 53){
			lbl53.setVisible(true);
			lbl53.setIcon(new ImageIcon(Main.class.getResource(location)));
		}
		else if(x == 54){
			lbl54.setVisible(true);
			lbl54.setIcon(new ImageIcon(Main.class.getResource(location)));
		}
		else if(x == 55){
			lbl55.setVisible(true);
			lbl55.setIcon(new ImageIcon(Main.class.getResource(location)));
		}
		else if(x == 56){
			lbl56.setVisible(true);
			lbl56.setIcon(new ImageIcon(Main.class.getResource(location)));
		}
		else if(x == 57){
			lbl57.setVisible(true);
			lbl57.setIcon(new ImageIcon(Main.class.getResource(location)));
		}
		else if(x == 58){
			lbl58.setVisible(true);
			lbl58.setIcon(new ImageIcon(Main.class.getResource(location)));
		}
		else if(x == 59){
			lbl59.setVisible(true);
			lbl59.setIcon(new ImageIcon(Main.class.getResource(location)));
		}
		else if(x == 60){
			lbl60.setVisible(true);
			lbl60.setIcon(new ImageIcon(Main.class.getResource(location)));
		}

		else if(x == 61){
			lbl61.setVisible(true);
			lbl61.setIcon(new ImageIcon(Main.class.getResource(location)));
		}
		else if(x == 62){
			lbl62.setVisible(true);
			lbl62.setIcon(new ImageIcon(Main.class.getResource(location)));
		}
		else if(x == 63){
			lbl63.setVisible(true);
			lbl63.setIcon(new ImageIcon(Main.class.getResource(location)));
		}
		else if(x == 64){
			lbl64.setVisible(true);
			lbl64.setIcon(new ImageIcon(Main.class.getResource(location)));
		}
		else if(x == 65){
			lbl65.setVisible(true);
			lbl65.setIcon(new ImageIcon(Main.class.getResource(location)));
		}
		else if(x == 66){
			lbl66.setVisible(true);
			lbl66.setIcon(new ImageIcon(Main.class.getResource(location)));
		}
		else if(x == 67){
			lbl67.setVisible(true);
			lbl67.setIcon(new ImageIcon(Main.class.getResource(location)));
		}
		else if(x == 68){
			lbl68.setVisible(true);
			lbl68.setIcon(new ImageIcon(Main.class.getResource(location)));
		}
		else if(x == 69){
			lbl69.setVisible(true);
			lbl69.setIcon(new ImageIcon(Main.class.getResource(location)));
		}
		else if(x == 70){
			lbl70.setVisible(true);
			lbl70.setIcon(new ImageIcon(Main.class.getResource(location)));
		}

		else if(x == 71){
			lbl71.setVisible(true);
			lbl71.setIcon(new ImageIcon(Main.class.getResource(location)));
		}
		else if(x == 72){
			lbl72.setVisible(true);
			lbl72.setIcon(new ImageIcon(Main.class.getResource(location)));
		}
		else if(x == 73){
			lbl73.setVisible(true);
			lbl73.setIcon(new ImageIcon(Main.class.getResource(location)));
		}
		else if(x == 74){
			lbl74.setVisible(true);
			lbl74.setIcon(new ImageIcon(Main.class.getResource(location)));
		}
		else if(x == 75){
			lbl75.setVisible(true);
			lbl75.setIcon(new ImageIcon(Main.class.getResource(location)));
		}
		else if(x == 76){
			lbl76.setVisible(true);
			lbl76.setIcon(new ImageIcon(Main.class.getResource(location)));
		}
		else if(x == 77){
			lbl77.setVisible(true);
			lbl77.setIcon(new ImageIcon(Main.class.getResource(location)));
		}
		else if(x == 78){
			lbl78.setVisible(true);
			lbl78.setIcon(new ImageIcon(Main.class.getResource(location)));
		}
		else if(x == 79){
			lbl79.setVisible(true);
			lbl79.setIcon(new ImageIcon(Main.class.getResource(location)));
		}
		else if(x == 80){
			lbl80.setVisible(true);
			lbl80.setIcon(new ImageIcon(Main.class.getResource(location)));
		}

		else if(x == 81){
			lbl81.setVisible(true);
			lbl81.setIcon(new ImageIcon(Main.class.getResource(location)));
		}
		else if(x == 82){
			lbl82.setVisible(true);
			lbl82.setIcon(new ImageIcon(Main.class.getResource(location)));
		}
		else if(x == 83){
			lbl83.setVisible(true);
			lbl83.setIcon(new ImageIcon(Main.class.getResource(location)));
		}
		else if(x == 84){
			lbl84.setVisible(true);
			lbl84.setIcon(new ImageIcon(Main.class.getResource(location)));
		}
		else if(x == 85){
			lbl85.setVisible(true);
			lbl85.setIcon(new ImageIcon(Main.class.getResource(location)));
		}
		else if(x == 86){
			lbl86.setVisible(true);
			lbl86.setIcon(new ImageIcon(Main.class.getResource(location)));
		}
		else if(x == 87){
			lbl87.setVisible(true);
			lbl87.setIcon(new ImageIcon(Main.class.getResource(location)));
		}
		else if(x == 88){
			lbl88.setVisible(true);
			lbl88.setIcon(new ImageIcon(Main.class.getResource(location)));
		}
		else if(x == 89){
			lbl89.setVisible(true);
			lbl89.setIcon(new ImageIcon(Main.class.getResource(location)));
		}
		else if(x == 90){
			lbl90.setVisible(true);
			lbl90.setIcon(new ImageIcon(Main.class.getResource(location)));
		}

		else if(x == 91){
			lbl91.setVisible(true);
			lbl91.setIcon(new ImageIcon(Main.class.getResource(location)));
		}
		else if(x == 92){
			lbl92.setVisible(true);
			lbl92.setIcon(new ImageIcon(Main.class.getResource(location)));
		}
		else if(x == 93){
			lbl93.setVisible(true);
			lbl93.setIcon(new ImageIcon(Main.class.getResource(location)));
		}
		else if(x == 94){
			lbl94.setVisible(true);
			lbl94.setIcon(new ImageIcon(Main.class.getResource(location)));
		}
		else if(x == 95){
			lbl95.setVisible(true);
			lbl95.setIcon(new ImageIcon(Main.class.getResource(location)));
		}
		else if(x == 96){
			lbl96.setVisible(true);
			lbl96.setIcon(new ImageIcon(Main.class.getResource(location)));
		}
		else if(x == 97){
			lbl97.setVisible(true);
			lbl97.setIcon(new ImageIcon(Main.class.getResource(location)));
		}
		else if(x == 98){
			lbl98.setVisible(true);
			lbl98.setIcon(new ImageIcon(Main.class.getResource(location)));
		}
		else if(x == 99){
			lbl99.setVisible(true);
			lbl99.setIcon(new ImageIcon(Main.class.getResource(location)));
		}
		else if(x == 100){
			lbl100.setVisible(true);
			lbl100.setIcon(new ImageIcon(Main.class.getResource(location)));
		}

		//bug fix er jonne nicher tukun
		//JOptionPane.showMessageDialog(null, "image set at "+String.valueOf(x)+" for player "+String.valueOf(pl));

	}






	@SuppressWarnings("serial")
	public void initialize(){    //game board er label, ghorer label and other label gula shob initialize kortesi

//-----------------------------------------------------------------------------------------------------------------------//
		// Input no of players
		
		try{
			do{
				JOptionPane.showMessageDialog(null, "Players must be between 2-4!");
				playerPos = Integer.parseInt(JOptionPane.showInputDialog("Enter No of players"));
			}while(playerPos < 2 || playerPos > 4);
		}catch(Exception e){
			JOptionPane.showMessageDialog(null, "Invalid players");
			System.exit(0);		// Error and exit
		}


		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1020, 720);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		lbl1 = new JLabel("");
		lbl1.setBounds(92, 576, 60, 60);
		contentPane.add(lbl1);

		 lbl2 = new JLabel("");
		lbl2.setBounds(151, 576, 60, 60);
		contentPane.add(lbl2);

		 lbl3 = new JLabel("");
		lbl3.setBounds(211, 576, 60, 60);
		contentPane.add(lbl3);

		 lbl4 = new JLabel("");
		lbl4.setBounds(271, 576, 60, 60);
		contentPane.add(lbl4);

		 lbl5 = new JLabel("");
		lbl5.setBounds(331, 576, 60, 60);
		contentPane.add(lbl5);

		 lbl6 = new JLabel("");
		lbl6.setBounds(393, 576, 60, 60);
		contentPane.add(lbl6);

		 lbl7 = new JLabel("");
		lbl7.setBounds(453, 576, 60, 60);
		contentPane.add(lbl7);

		 lbl8 = new JLabel("");
		lbl8.setBounds(511, 576, 60, 60);
		contentPane.add(lbl8);

		 lbl9 = new JLabel("");
		lbl9.setBounds(572, 576, 60, 60);
		contentPane.add(lbl9);

		 lbl10 = new JLabel("");
		lbl10.setBounds(630, 576, 60, 60);
		contentPane.add(lbl10);

		 lbl19 = new JLabel("");
		lbl19.setBounds(151, 517, 60, 60);
		contentPane.add(lbl19);

		 lbl20 = new JLabel("");
		lbl20.setBounds(92, 517, 60, 60);
		contentPane.add(lbl20);

		 lbl18 = new JLabel("");
		lbl18.setBounds(211, 517, 60, 60);
		contentPane.add(lbl18);

		 lbl17 = new JLabel("");
		lbl17.setBounds(271, 517, 60, 60);
		contentPane.add(lbl17);

		 lbl16 = new JLabel("");
		lbl16.setBounds(331, 517, 60, 60);
		contentPane.add(lbl16);

		 lbl15 = new JLabel("");
		lbl15.setBounds(393, 517, 60, 60);
		contentPane.add(lbl15);

		 lbl14 = new JLabel("");
		lbl14.setBounds(453, 517, 60, 60);
		contentPane.add(lbl14);

		 lbl13 = new JLabel("");
		lbl13.setBounds(511, 517, 60, 60);
		contentPane.add(lbl13);

		 lbl12 = new JLabel("");
		lbl12.setBounds(572, 517, 60, 60);
		contentPane.add(lbl12);

		 lbl11 = new JLabel("");
		lbl11.setBounds(630, 517, 60, 60);
		contentPane.add(lbl11);

		 lbl22 = new JLabel("");
		lbl22.setBounds(151, 457, 60, 60);
		contentPane.add(lbl22);

		 lbl21 = new JLabel("");
		lbl21.setBounds(92, 457, 60, 60);
		contentPane.add(lbl21);

		 lbl23 = new JLabel("");
		lbl23.setBounds(211, 457, 60, 60);
		contentPane.add(lbl23);

		 lbl24 = new JLabel("");
		lbl24.setBounds(271, 457, 60, 60);
		contentPane.add(lbl24);

		 lbl25 = new JLabel("");
		lbl25.setBounds(331, 457, 60, 60);
		contentPane.add(lbl25);

		 lbl26 = new JLabel("");
		lbl26.setBounds(393, 457, 60, 60);
		contentPane.add(lbl26);

		 lbl27 = new JLabel("");
		lbl27.setBounds(453, 457, 60, 60);
		contentPane.add(lbl27);

		 lbl28 = new JLabel("");
		lbl28.setBounds(511, 457, 60, 60);
		contentPane.add(lbl28);

		 lbl29 = new JLabel("");
		lbl29.setBounds(572, 457, 60, 60);
		contentPane.add(lbl29);

		 lbl30 = new JLabel("");
		lbl30.setBounds(630, 457, 60, 60);
		contentPane.add(lbl30);

		 lbl39 = new JLabel("");
		lbl39.setBounds(151, 396, 60, 60);
		contentPane.add(lbl39);

		 lbl40 = new JLabel("");
		lbl40.setBounds(92, 396, 60, 60);
		contentPane.add(lbl40);

		 lbl38 = new JLabel("");
		lbl38.setBounds(211, 396, 60, 60);
		contentPane.add(lbl38);

		 lbl37 = new JLabel("");
		lbl37.setBounds(271, 396, 60, 60);
		contentPane.add(lbl37);

		 lbl36 = new JLabel("");
		lbl36.setBounds(331, 396, 60, 60);
		contentPane.add(lbl36);

		 lbl35 = new JLabel("");
		lbl35.setBounds(393, 396, 60, 60);
		contentPane.add(lbl35);

		 lbl34 = new JLabel("");
		lbl34.setBounds(453, 396, 60, 60);
		contentPane.add(lbl34);

		 lbl33 = new JLabel("");
		lbl33.setBounds(511, 396, 60, 60);
		contentPane.add(lbl33);

		 lbl32 = new JLabel("");
		lbl32.setBounds(572, 396, 60, 60);
		contentPane.add(lbl32);

		 lbl31 = new JLabel("");
		lbl31.setBounds(630, 396, 60, 60);
		contentPane.add(lbl31);

		 lbl42 = new JLabel("");
		lbl42.setBounds(151, 335, 60, 60);
		contentPane.add(lbl42);

		 lbl41 = new JLabel("");
		lbl41.setBounds(92, 335, 60, 60);
		contentPane.add(lbl41);

		 lbl43 = new JLabel("");
		lbl43.setBounds(211, 335, 60, 60);
		contentPane.add(lbl43);

		 lbl44 = new JLabel("");
		lbl44.setBounds(271, 335, 60, 60);
		contentPane.add(lbl44);

		 lbl45 = new JLabel("");
		lbl45.setBounds(331, 335, 60, 60);
		contentPane.add(lbl45);

		 lbl46 = new JLabel("");
		lbl46.setBounds(393, 335, 60, 60);
		contentPane.add(lbl46);

		 lbl47 = new JLabel("");
		lbl47.setBounds(453, 335, 60, 60);
		contentPane.add(lbl47);

         lbl48 = new JLabel("");
		lbl48.setBounds(511, 335, 60, 60);
		contentPane.add(lbl48);

		 lbl49 = new JLabel("");
		lbl49.setBounds(572, 335, 60, 60);
		contentPane.add(lbl49);

		 lbl50 = new JLabel("");
		lbl50.setBounds(630, 335, 60, 60);
		contentPane.add(lbl50);

		 lbl59 = new JLabel("");
		lbl59.setBounds(151, 277, 60, 60);
		contentPane.add(lbl59);

		 lbl60 = new JLabel("");
		lbl60.setBounds(92, 277, 60, 60);
		contentPane.add(lbl60);

		 lbl58 = new JLabel("");
		lbl58.setBounds(211, 277, 60, 60);
		contentPane.add(lbl58);

		 lbl57 = new JLabel("");
		lbl57.setBounds(271, 277, 60, 60);
		contentPane.add(lbl57);

		 lbl56 = new JLabel("");
		lbl56.setBounds(331, 277, 60, 60);
		contentPane.add(lbl56);

		 lbl55 = new JLabel("");
		lbl55.setBounds(393, 277, 60, 60);
		contentPane.add(lbl55);

		 lbl54 = new JLabel("");
		lbl54.setBounds(453, 277, 60, 60);
		contentPane.add(lbl54);

		 lbl53 = new JLabel("");
		lbl53.setBounds(511, 277, 60, 60);
		contentPane.add(lbl53);

		 lbl52 = new JLabel("");
		lbl52.setBounds(572, 277, 60, 60);
		contentPane.add(lbl52);

		 lbl51 = new JLabel("");
		lbl51.setBounds(630, 277, 60, 60);
		contentPane.add(lbl51);

		 lbl62 = new JLabel("");
		lbl62.setBounds(151, 217, 60, 60);
		contentPane.add(lbl62);

		 lbl61 = new JLabel("");
		lbl61.setBounds(92, 217, 60, 60);
		contentPane.add(lbl61);

		 lbl63 = new JLabel("");
		lbl63.setBounds(211, 217, 60, 60);
		contentPane.add(lbl63);

		 lbl64 = new JLabel("");
		lbl64.setBounds(271, 217, 60, 60);
		contentPane.add(lbl64);

		 lbl65 = new JLabel("");
		lbl65.setBounds(331, 217, 60, 60);
		contentPane.add(lbl65);

		 lbl66 = new JLabel("");
		lbl66.setBounds(393, 217, 60, 60);
		contentPane.add(lbl66);

		 lbl67 = new JLabel("");
		lbl67.setBounds(453, 217, 60, 60);
		contentPane.add(lbl67);

		 lbl68 = new JLabel("");
		lbl68.setBounds(511, 217, 60, 60);
		contentPane.add(lbl68);

		 lbl69 = new JLabel("");
		lbl69.setBounds(572, 217, 60, 60);
		contentPane.add(lbl69);

		 lbl70 = new JLabel("");
		lbl70.setBounds(630, 217, 60, 60);
		contentPane.add(lbl70);

		 lbl79 = new JLabel("");
		lbl79.setBounds(151, 157, 60, 60);
		contentPane.add(lbl79);

		 lbl80 = new JLabel("");
		lbl80.setBounds(92, 157, 60, 60);
		contentPane.add(lbl80);

		 lbl78 = new JLabel("");
		lbl78.setBounds(211, 157, 60, 60);
		contentPane.add(lbl78);

		 lbl77 = new JLabel("");
		lbl77.setBounds(271, 157, 60, 60);
		contentPane.add(lbl77);

		 lbl76 = new JLabel("");
		lbl76.setBounds(341, 157, 50, 60);
		contentPane.add(lbl76);

		 lbl75 = new JLabel("");
		lbl75.setBounds(393, 157, 60, 60);
		contentPane.add(lbl75);

		 lbl74 = new JLabel("");
		lbl74.setBounds(453, 157, 60, 60);
		contentPane.add(lbl74);

		 lbl73 = new JLabel("");
		lbl73.setBounds(511, 157, 60, 60);
		contentPane.add(lbl73);

		 lbl72 = new JLabel("");
		lbl72.setBounds(572, 157, 60, 60);
		contentPane.add(lbl72);

		 lbl71 = new JLabel("");
		lbl71.setBounds(630, 157, 60, 60);
		contentPane.add(lbl71);

		 lbl82 = new JLabel("");
		lbl82.setBounds(151, 97, 60, 60);
		contentPane.add(lbl82);

		 lbl81 = new JLabel("");
		lbl81.setBounds(92, 97, 60, 60);
		contentPane.add(lbl81);

		 lbl83 = new JLabel("");
		lbl83.setBounds(211, 97, 60, 60);
		contentPane.add(lbl83);

		 lbl84 = new JLabel("");
		lbl84.setBounds(271, 97, 60, 60);
		contentPane.add(lbl84);

		 lbl85 = new JLabel("");
		lbl85.setBounds(331, 97, 60, 60);
		contentPane.add(lbl85);

		 lbl86 = new JLabel("");
		lbl86.setBounds(393, 97, 60, 60);
		contentPane.add(lbl86);

		 lbl87 = new JLabel("");
		lbl87.setBounds(453, 97, 60, 60);
		contentPane.add(lbl87);

		 lbl88 = new JLabel("");
		lbl88.setBounds(511, 97, 60, 60);
		contentPane.add(lbl88);

		 lbl89 = new JLabel("");
		lbl89.setBounds(572, 97, 60, 60);
		contentPane.add(lbl89);

		 lbl90 = new JLabel("");
		lbl90.setBounds(630, 97, 60, 60);
		contentPane.add(lbl90);

		 lbl99 = new JLabel("");
		lbl99.setBounds(151, 38, 60, 60);
		contentPane.add(lbl99);

		 lbl100 = new JLabel("");
		lbl100.setBounds(92, 38, 60, 60);
		contentPane.add(lbl100);

		 lbl98 = new JLabel("");
		lbl98.setBounds(211, 38, 60, 60);
		contentPane.add(lbl98);

		 lbl97 = new JLabel("");
		lbl97.setBounds(271, 38, 60, 60);
		contentPane.add(lbl97);

		 lbl96 = new JLabel("");
		lbl96.setBounds(331, 38, 60, 60);
		contentPane.add(lbl96);

		 lbl95 = new JLabel("");
		lbl95.setBounds(393, 38, 60, 60);
		contentPane.add(lbl95);

		 lbl94 = new JLabel("");
		lbl94.setBounds(453, 38, 60, 60);
		contentPane.add(lbl94);

		 lbl93 = new JLabel("");
		lbl93.setBounds(511, 38, 60, 60);
		contentPane.add(lbl93);

		 lbl92 = new JLabel("");
		lbl92.setBounds(572, 38, 60, 60);
		contentPane.add(lbl92);

		 lbl91 = new JLabel("");
		lbl91.setBounds(630, 38, 60, 60);
		contentPane.add(lbl91);

		 lblPlayerName = new JLabel("Playing Player -");
		 lblPlayerName.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		 lblPlayerName.setForeground(new Color(51, 204, 204));
		lblPlayerName.setBounds(712, 67, 132, 26);
		contentPane.add(lblPlayerName);

		 btnDice = new JButton("Roll Dice");
		 btnDice.setFont(new Font("Comic Sans MS", Font.BOLD, 27));
		 btnDice.setForeground(new Color(255, 255, 255));
		 btnDice.setBackground(new Color(0, 0, 51));
		 btnDice.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		btnDice.setBackground(new Color(204, 0, 102));
		 		if(chokka==0){
		 		if(winingPosition==playerPos-1){
		 			int confirm = JOptionPane.showConfirmDialog(null, "Replay?", "", JOptionPane.YES_NO_OPTION);
					if(confirm == JOptionPane.YES_OPTION){
						dispose();
						Main frame = new Main();
						frame.setVisible(true);
					}
					else{
						setVisible(false); //you can't see me!
						dispose(); //Destroy the JFrame object
						
					}
		 		}
		 		
		 		//--------current player number show-------//
		 	
		 		if(player==playerPos)lblPlayer.setText(playerName[0]);
	
	 		else lblPlayer.setText(playerName[player]);
		 		
			 	//	if(player==playerPos)lblPlayer.setText(String.valueOf(1));
		 		//else lblPlayer.setText(String.valueOf(player+1));
			
				
				
		 		
		 		if(player==4){
		 			lblPlayer.setForeground(new Color(0, 204, 255)); //1
		 		}
		 		if(player==1){
		 			lblPlayer.setForeground(new Color(255, 204, 0)); //4
		 		}
		 		if(player==2){
		 			lblPlayer.setForeground(new Color(255, 51, 102)); //3
		 		}
		 		if(player==3){
		 			
		 			lblPlayer.setForeground(new Color(204, 51, 204)); //2
		 		}
		 		
		 		
		 		
		 		//---------------------------------------------//
		 		}
		 		
		 		Dice();                           //dice method call kortesi
		 		if(chokka==0)
		 		{
		 			player++;            //1jon dice click korlo... then arekjon dice click korbe, tai player count baraye  dise.
		 		    if(player==playerPos+1)player=1;

		 		    while(playerposition[player-1]>=100){
		 		    	
		 		    	if(player==playerPos)lblPlayer.setText(playerName[0]);
		 			 		else lblPlayer.setText(playerName[player]);
		 		    	
		 		    	player++;            //1jon dice click korlo... then arekjon dice click korbe, tai player count baraye  dise.
			 		    if(player==playerPos+1)player=1; 
		 		    }
		 		}// karon amr game e 4jon player
		 		
		 		

		 	}
		 });
		 btnDice.setBackground(new Color(0, 0, 51));
		btnDice.setBounds(712, 122, 162, 44);
		contentPane.add(btnDice);


		//nicher ongshotukur kaj enter button chaplei jate  button kaj kore taai..
		contentPane.getRootPane().getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(
                KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), "EXIT");
                contentPane.getRootPane().getActionMap().put("EXIT", new AbstractAction(){
                public void actionPerformed(ActionEvent e)
                	{
                		btnDice.doClick();
                	}
                });


		lblP1 = new JLabel("Player1-");
		lblP1.setForeground(new Color(0, 204, 255));
		lblP1.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblP1.setBounds(702, 323, 118, 26);
		contentPane.add(lblP1);

		lblDimage = new JLabel(".");
		lblDimage.setHorizontalAlignment(SwingConstants.CENTER);
		lblDimage.setBounds(724, 176, 132, 129);
		contentPane.add(lblDimage);

        p1score = new JLabel("Score");
        p1score.setHorizontalAlignment(SwingConstants.LEFT);
        p1score.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
        p1score.setForeground(new Color(255, 255, 255));
        p1score.setBounds(830, 329, 74, 20);
        contentPane.add(p1score);

        lblP2 = new JLabel("Player2-");
        lblP2.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        lblP2.setForeground(new Color(255, 204, 0));
        lblP2.setBounds(700, 383, 118, 26);
        contentPane.add(lblP2);

        p2score = new JLabel("Score");
        p2score.setHorizontalAlignment(SwingConstants.LEFT);
        p2score.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
        p2score.setForeground(new Color(255, 255, 255));
        p2score.setBounds(830, 389, 74, 20);
        contentPane.add(p2score);
        lblBoard.setBounds(92, 38, 600, 600);
        contentPane.add(lblBoard);



        lblBoard.setIcon(new ImageIcon(Main.class.getResource("/Image/Board Small 600 600.png")));

        lblP3 = new JLabel("Player3-");
        lblP3.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        lblP3.setForeground(new Color(255, 51, 102));
        lblP3.setBounds(702, 437, 118, 26);
        contentPane.add(lblP3);

        p3score = new JLabel("Score");
        p3score.setHorizontalAlignment(SwingConstants.LEFT);
        p3score.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
        p3score.setForeground(new Color(255, 255, 255));
        p3score.setBounds(830, 442, 74, 21);
        contentPane.add(p3score);

        lblP4 = new JLabel("Player4-");
        lblP4.setForeground(new Color(204, 51, 204));
        lblP4.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        lblP4.setBounds(700, 489, 118, 24);
        contentPane.add(lblP4);

        p4score = new JLabel("Score");
        p4score.setHorizontalAlignment(SwingConstants.LEFT);
        p4score.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
        p4score.setForeground(new Color(255, 255, 255));
        p4score.setBounds(830, 494, 74, 23);
        contentPane.add(p4score);

        lblPlayer = new JLabel("");
        lblPlayer.setHorizontalAlignment(SwingConstants.LEFT);
        lblPlayer.setForeground(new Color(255, 0, 0));
        lblPlayer.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 22));
        lblPlayer.setBounds(844, 67, 150, 26);
        contentPane.add(lblPlayer);

        p1btn = new JLabel("");
        p1btn.setIcon(new ImageIcon(Main.class.getResource("/Image/player 1.png")));
        p1btn.setBounds(914, 312, 50, 50);
        contentPane.add(p1btn);

        label = new JLabel("");
        label.setIcon(new ImageIcon(Main.class.getResource("/Image/player 2.png")));
        label.setBounds(914, 373, 50, 50);
        contentPane.add(label);

        label_1 = new JLabel("");
        label_1.setIcon(new ImageIcon(Main.class.getResource("/Image/player 3.png")));
        label_1.setBounds(914, 428, 50, 50);
        contentPane.add(label_1);

        label_2 = new JLabel("");
        label_2.setIcon(new ImageIcon(Main.class.getResource("/Image/player 4.png")));
        label_2.setBounds(914, 482, 50, 50);
        contentPane.add(label_2);



        btnRestart = new JButton("Restart??");
        btnRestart.setBackground(new Color(255, 255, 255));
        btnRestart.setFont(new Font("Tahoma", Font.BOLD, 18));
        btnRestart.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		int confirm = JOptionPane.showConfirmDialog(null, "Do you want to Restart?", "Restart!!!", JOptionPane.YES_NO_OPTION);
				if(confirm == JOptionPane.YES_OPTION){
					dispose();
					Main frame = new Main();
					frame.setVisible(true);
				}
        	}
        });
        btnRestart.setBounds(734, 576, 150, 60);
        contentPane.add(btnRestart);
        
      // if(player==1) lblPlayer.setForeground(new Color(0, 204, 255)); 
        //if(player==2)lblPlayer.setForeground(new Color(255, 204, 0)); 
        inputName();     //name input deya hocche ei method e
        lblPlayer.setText(playerName[0]);  //initially playing player er nam hocche 1st player

        for(int i=0;i<playerPos;i++){
        	playerposition[i]=0;
        }
	}

	
	public void inputName(){
		
	     // Initialize variables

     	playerName = new String[playerPos];
     	
     		for(int i=0; i<playerPos; i++){

     			playerName[i] = "Player "+String.valueOf(i+1);

     		}

     // Input Names
     		int confirm = JOptionPane.showConfirmDialog(null, "Do you want Skip Names?", "Player!", JOptionPane.YES_NO_OPTION);
     		if(confirm == JOptionPane.NO_OPTION){
     			for(int i=0; i<playerPos; i++){
     			
     				try{
     				
     					//do{
     						playerName[i] = JOptionPane.showInputDialog("Enter Name of Player "+ String.valueOf(i+1)+" :");
     						JOptionPane.showMessageDialog(null, playerName[i]);
     				//	}while(playerName[i].equals(""));
     				}catch(Exception e){
     					JOptionPane.showMessageDialog(null, "Invalid name");
     					playerName[i] = "Player "+ String.valueOf(i+1);
     				}
     			}
     		}
     	
     		if(playerPos == 2){
     			// = Integer.parseInt(JOptionPane.showInputDialog("Enter No of players"));
     			lblP1.setText(playerName[0]);
     			lblP2.setText(playerName[1]);
     			
     			label_1.setVisible(false);
     			lblP3.setVisible(false);
     			p3score.setVisible(false);
     			
     			label_2.setVisible(false);
     			lblP4.setVisible(false);
     			p4score.setVisible(false);
     			
     		}
     		else if(playerPos == 3){
     			lblP1.setText(playerName[0]);
     			lblP2.setText(playerName[1]);
     			lblP3.setText(playerName[2]);
     			
     			label_2.setVisible(false);
     			lblP4.setVisible(false);
     			p4score.setVisible(false);
     			
     		}
     		else if(playerPos == 4){
     			lblP1.setText(playerName[0]);
     			lblP2.setText(playerName[1]);
     			lblP3.setText(playerName[2]);
     			lblP4.setText(playerName[3]);
     			

     		}
		
	}
	
	
	public void FrameinMiddle() {

		Dimension screenSize,frameSize;
		int x,y;
		screenSize=Toolkit.getDefaultToolkit().getScreenSize();
		frameSize=getSize();
		x=(screenSize.width-frameSize.width)/2;
		y=(screenSize.height-frameSize.height)/2;
		setLocation(x, y);
		}
}
