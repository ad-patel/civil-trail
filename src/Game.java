

import processing.core.*;

public class Game extends PApplet {

	// PImage startt; : HOW TO OPEN IMG VARIABLE
	int stage = 0;
	int stage0C = 0, stage1C=0, stage2C=0, stage3C=0, stage4C=0, stage5C=0, stage6C=0, stageBounceC = 0;
	int ac =0, bc=0, cc=0, dc=0;
	boolean unique = false, malaria = false, running=false, cannon = false;
	boolean unique1, malaria1, running1, cannon1;
	boolean unique2, malaria2, running2, cannon2;
	int playerRole;
	int countLine = 0;
	int friendC = 4;
	int dodgeCount =0;
	double surviveC = 1;
	int counter1 = 0, counter2=0, counter3=0, counter4=0;
	int countera1 = 0, countera2=0, countera3=0, countera4=0;
	int counterb1 = 0, counterb2=0, counterb3=0, counterb4=0;
	PImage metadata, box,ir, name, end;
	PImage one, two, three, four,shT, s1, s2, s3;
	PImage homeScreen, people, join, lottery, lots;
	PImage uno, dos, thres, get, f1, f2;
	PImage irish, afam, white;
	PImage bounce, firstB, note;
	PImage if1, if2, if3,up, ap, ap1, ap2, mead, die, surv, a, b, c, d;
	PImage listA, then1, then2, then3;
	PImage first1, first2, first3, secondB, second1, second2;
	PImage final2S, n1, n2, n3, n4, gett, three1, three2;
	PImage success, rip, ui, ua, uw, finalF, run, mal, can, finalS, dodge, maze;
	
	
	
	// First Battle 
	int paddleWidth = 100;
	int initialSpeedX = 5;
	int initialSpeedY = -6;
	int ballSpeedX = initialSpeedX;
	int ballSpeedY = initialSpeedY;
	int ballX, ballY = 0;
	boolean ballMoving = false;
	
	int rect1x = 0;
	int rect1y = 0;
	int rect1w = 400;
	int rect1h = 5;
	int rect2x = 395;
	int rect2y = 68;
	int rect2w = 5;
	int rect2h = 328;
	int rect3x = 0;
	int rect3y = 395;
	int rect3w = 400;
	int rect3h = 5;
	int rect4x = 0;
	int rect4y = 72;
	int rect4w = 50;
	int rect4h = 330;
	int rect5x = 104;
	int rect5y = 0;
	int rect5w = 50;
	int rect5h = 330;
	int rect6x = 217;
	int rect6y = 72;
	int rect6w = 50;
	int rect6h = 330;
	int rect7x = 308;
	int rect7y = 0;
	int rect7w = 42;
	int rect7h = 330;
	int startX = 0;
	int startY = 10;
	int roboX = 0;
	int roboY = startY;
	int roboW = 24;
	int roboH = 29;
	
	
	float ypos = 200;
	float line1Y = 50;
	float line1_len = 50;
	float line1X = 440;
	double speed1 = 2;
	double speed2 = 2;
	double score = 0;
	float line2Y = 200;
	float line2_len = 300;
	float line2X = 640;
	boolean multiplayer = false;
	boolean single = true;
	double score2 = 0;
	double timeLeft = 30;
	double counter = 0;
	float ax = 13;
	float ay = 25;
	double bx = 29;
	double by = 25;
	double cx = 45;
	double cy = 25;

	double mult_Y = 100;

	boolean moving = true;
	
	

	public void settings() {
		stage = 0;
		size(800, 800);
	}

	public void setup() {
		stage = 0;
		frameRate(75);
		size(800, 800);
		//file = new SoundFile(this, "jasmin.mp3");
		//file.play();
		//startt = loadImage("startt.jpg") : LOADING IMG
		metadata = loadImage("meta.png");
		box = loadImage("box.png");
		name = loadImage("name.png");
		one = loadImage("one.png");
		two = loadImage("two.png");
		end = loadImage("end.png");
		three = loadImage("three.png");
		four = loadImage("four.png");
		homeScreen = loadImage("home.png");
		uno = loadImage("uno.png");
		dos = loadImage("dos.png");
		thres = loadImage("thres.png");
		people = loadImage("people.png");
		irish = loadImage("irish.png");
		afam = loadImage("afam.png");
		white = loadImage("white.png");
		join = loadImage("join.png");
		note = loadImage("note.png");
		up= loadImage("up.png");
		lottery = loadImage("lottery.png");
		lots = loadImage("lotterys.png");
		bounce = loadImage("bounce.png");
		firstB = loadImage("firstbat.png");
		if1 = loadImage("if1.png");
		if2 = loadImage("if2.png");
		if3 = loadImage("if3.png");
		listA = loadImage("listA.png");
		then1 = loadImage("then1.png");
		then2 = loadImage("then2.png");
		then3 = loadImage("then3.png");
		first1 = loadImage("first1.png");
		first2 = loadImage("first2.png");
		first3 = loadImage("first3.png");
		rip = loadImage("rip.png");
		success = loadImage("flag.png");
		ui = loadImage("ui.png");
		ua = loadImage("ua.png");
		uw = loadImage("uw.png");
		finalF = loadImage("finalF.png");
		run = loadImage("run.png");
		can = loadImage("can.png");
		mal = loadImage("skull.png");
		secondB = loadImage("secondB.png");
		second1 = loadImage("second1.png");
		second2 = loadImage("second2.png");
		finalS = loadImage("finalS.png");
		dodge = loadImage("dodge.png");
		final2S = loadImage("final2S.png");
		n1 = loadImage("n1.png");
		n2 = loadImage("n2.png");
		n3 = loadImage("n3.png");
		n4 = loadImage("n4.png");
		gett = loadImage("gett.png");
		three1 = loadImage("three1.png");
		three2 = loadImage("three2.png");
		maze = loadImage("maze.png");
		get = loadImage("get.png");
		f2 = loadImage("f2.png");
		f1= loadImage("f1.png");
		shT = loadImage("shT.png");
		s1 = loadImage("s1.png");
		s2 = loadImage("s2.png");
		s3 = loadImage("s3.png");
		ir = loadImage("ir.png");
		
		ap = loadImage("ap.png");
		ap1= loadImage("ap1.png");
		ap2 = loadImage("ap2.png");
		mead = loadImage("mead.png");
		die = loadImage("die.png");
		surv = loadImage("surv.png");
		a = loadImage("a.png");
		b = loadImage("b.png");
		c = loadImage("c.png");
		d = loadImage("d.png");
		
		
	}

	public void draw() {
		/*image(startt, 0, 0, width, height);
		PFont f = createFont("monospace", 20);
		fill(255);
		textFont(f);
		textSize(100);
		text("PIZZAAA", 100, 250);
		image(starter, 150, 300, width / 2, height / 4);
		if (mousePressed && mouseX > 275 && mouseX < 325 && mouseY > 0 && mouseY < 600) {
			stage = 1;
		}*/
		
		if (stage == 0) {
			if(stage0C < 200) {
				noStroke();
				background(0);
				image(metadata, 100, 100);
				stage0C++;
			}
			else 
				stage++;
		}
		
		if(stage == 1) {
			if(stage1C < 200) {
				noStroke();
				background(0);
				image(box, 100, 100);
				stage1C++;
			}
			else 
				stage++;
		}
		
		if(stage == 2) {
			if(stage2C < 200) {
				noStroke();
				background(0);
				image(name, 50, 150);
				stage2C++;
			}
			else 
				stage++;
		}
		
		if(stage ==3) {
			if(stage3C < 400) {
				noStroke();
				background(0);
				image(one, 50, 150);
				stage3C++;
			}
			else 
				stage++;
		}
		
		if(stage ==4) {
			if(stage4C < 400) {
				noStroke();
				background(0);
				image(two, 50, 150);
				stage4C++;
			}
			else 
				stage++;
		}
		
		if(stage ==5) {
			if(stage5C < 400) {
				noStroke();
				background(0);
				image(three, 50, 150);
				stage5C++;
			}
			else 
				stage++;
		}
		
		if(stage ==6) {
			if(stage6C < 500) {
				noStroke();
				background(0);
				image(four, 50, 150);
				stage6C++;
			}
			else 
				stage++;
		}
		
		if(stage == 7) {
			background(0);
			image(homeScreen, 30,50);
		}
		
		if(stage == 9) {
			background(0);
			image(uno, 30, 50);
		}
		
		if(stage == 10) {
			background(0);
			image(dos, 30, 50);
		}
		
		if(stage == 11) {
			background(0);
			image(thres, 30, 50);
		}
		
		if(stage == 8) {
			background(0);
			image(people, 30, 50);
		}
		
		if(stage == 12) {
			background(0);
			image(irish, 30, 50);
		}
		
		if(stage == 13) {
			background(0);
			image(afam, 30, 50);
		}
		
		if(stage == 14) {
			background(0);
			image(white, 30, 50);
		}
		
		if(stage == 15) {
			background(0);
			image(join, 30, 50);
		}
		
		if(stage == 16) {
			background(0);
			image(lots, 30, 50);
		}
		
		if(stage == 17) {
			background(0);
			image(lottery, 30, 50);
		}
		
		if(stage==18){
			noStroke();
			 background(0);
			 image(bounce, 25, 250);
			 
			
			    
			    // draw the paddle
			 if(stageBounceC < 2250) {
			    fill(240, 126, 65);
			    rect(mouseX - paddleWidth/2, 350, paddleWidth, 10);
			    
			    // move the ball
			    if (ballMoving) {
			        ballX += ballSpeedX;
			        ballY += ballSpeedY;
			    }
			    else {
			        ballX = mouseX;
			        ballY = 340;
			    }
			    
			    // draw the ball
			    fill(255, 234, 0);
			    ellipse(ballX, ballY, 20, 20);
			    
			    // check if ball has hit the top wall
			    if (ballY <= 10) {
			        ballSpeedY = -ballSpeedY;
			    }
			    // check if the ball has hit the left wall
			    if (ballX <= 10) {
			        ballSpeedX = -ballSpeedX;
			    }
			    // check if the ball has hit the right wall
			    if (ballX >= 790) {
			        ballSpeedX = -ballSpeedX;
			    }
			    // check if the ball has hit the paddle
			    if (ballY >= 340 && ballY < 346 && ballX >= mouseX - paddleWidth/2 && ballX <= mouseX + paddleWidth/2) {
			        ballSpeedY = -ballSpeedY;
			    }
			    // check if ball fell out the bottom
			    if (ballY >= 400) {
			        ballMoving = false;
			        friendC--;
			        stage=27;
			    } 
			    stageBounceC++;
			 }
			 else 
				 stage=28;
		}
		
		if(stage==19) {
			background(0);
			/*int u = (int) (Math.random()*10);
			if(u==1) {
				unique=true;friendC--;}
			
			int m = (int)(Math.random()*10);
			if(m<surviveC) {
				malaria = true;friendC--;}
			
			int r = (int)(Math.random()*10);
			if(r<surviveC) {
				running = true;friendC--;}
			
			int c = (int)(Math.random()*10);
			if(c<surviveC) {
				cannon = true;friendC--;}*/
			
			malaria = true;
			friendC--;
			
			
			stage=29;
		}
		
		if(stage == 20) {
			background(0);
			image(firstB, 20, 50);
		}
		
		if(stage ==21) {
			background(0);
			if(playerRole ==1)
				image(if1, 30, 50);
			else if(playerRole==2)
				image(if2, 30, 50);
			else 
				image(if3, 30, 50);
		}
		
		if(stage ==22) {
			background(0);
			image(listA, 30, 70);
		}
		
		if(stage ==23) {
			background(0);
			if(playerRole ==1)
				image(then1, 30, 70);
			else if(playerRole==2)
				image(then3, 30, 70);
			else 
				image(then2, 30, 70);
		}
		
		if(stage ==24) {
			background(0);
			image(first1, 30, 70);
		}
		
		if(stage ==25) {
			background(0);
			image(first2, 30, 70);
		}
		
		if(stage ==26) {
			background(0);
			image(first3, 30, 70);
		}
		
		if(stage==27) {
			background(0);
			image(rip, 30, 50);
		}
		
		if(stage==28) {
			background(0);
			image(success, 30, 50);
		}
		
		if(stage==29) {
			if(counter1 < 500 && unique) {
				noStroke();
				background(0);
				if(playerRole==1)
					image(ui, 30, 50);
				else if(playerRole==2)
					image(ua, 30, 50);
				else if(playerRole ==3)
					image(uw, 30, 50);
				counter1++;
			}
			else {
				unique=false;
				counter1=0;
				stage++;
			}
		}
		
		if(stage ==30) {
			if(counter2 < 500 && malaria) {
				noStroke();
				background(0);
				image(mal, 30, 50);
				counter2++;
			}
			else {
				malaria=false;
				counter2=0;
				stage++;
			}
		}
		
		if(stage ==31) {
			if(counter3 < 500 && running) {
				noStroke();
				background(0);
				image(run, 20, 50);
				counter3++;
			}
			else {
				running=false;
				counter3=0;
				stage++;
			}
		}
		
		if(stage ==32) {
			if(counter4 < 500 && cannon) {
				noStroke();
				background(0);
				image(can, 60, 50);
				counter4++;
			}
			else {
				cannon=false;
				counter4=0;
				stage++;
			}
		}
		
		if(stage ==33) {
			background(0);
			image(finalF, -40, 50);
		}
		
		if(stage==34) {
			background(0);
			image(secondB, -40, 50);
		}
		
		if(stage==35) {
			background(0);
			image(second1, -40, 50);
		}
		
		if(stage==36) {
			background(0);
			image(second2, -40, 50);
		}
		
		
		if(stage==37){
			noStroke();
			 background(0);
			 image(up, -5, 250);
			 if(countLine < 2250) {
				 countLine++;
				 if (moving) {
					    noStroke();
					    stroke(255, 255, 255);
					    strokeWeight(4);
					    line(line1X, line1Y, line1X+line1_len, line1Y);
					    line(line2X, line2Y, line2X+line2_len, line2Y);
					   
					    noStroke();
					    
					    fill(255, 0, 0);
					    ellipse(100,ypos,26,26);
					    
					    
					    ypos = mouseY;
					   
					        
					    if(ypos>387)
					        { ypos = 387;}
					    
					    if(ypos<13)
					    {
					        ypos=13;
					    }
					        
					    line1X-= speed1;
					    line2X-= speed2;
					    
					    
					    //single play game 
					    if(single){
					    
					    if(line1X < 0-line1_len){
					        line1X = 800;
					        line1Y = (float)Math.random()*350 + 50;
					        line1_len = (float)Math.random()*300 + 20;
					        speed1+= 0.5;
					        if(cx>0){ cx = -100; }
					        else if(bx>0) { bx = -100; }
					        else if(ax>0) { fill(255, 243, 232);
					   ellipse(ax,ay,15,15); moving = false; }}
					        

					    if(line2X < 0-line2_len){
					        line2X = 800;
					        line2Y = (float)Math.random()*350 + 50;
					        line2_len = (float)Math.random()*300 + 20;
					        speed2+= 0.5;
					        if(cx>0){ cx = -100; }
					        else if(bx>0) { bx = -100; }
					        else if(ax>0) {  fill(255, 243, 232);
					   ellipse(ax,ay,15,15);  moving = false; }
					        
					    }
					    
					   if(line1Y < (ypos+13) && line1Y > (ypos-13) && line1X < 113 && (line1X+line1_len) > 87){
					       line1X = 800;
					       score++;
					        line1Y = (float)Math.random()*350 + 50;
					        line1_len = (float)Math.random()*300 + 5; 
					        speed1+= 0.55;
					   }
					        
					    if(line2Y < (ypos+13) && line2Y > (ypos-13) && line2X < 113 && (line2X+line2_len) > 87){
					       line2X = 800;
					       score++;
					        line2Y = (float)Math.random()*350 + 50;
					        line2_len = (float)Math.random()*300 + 5; 
					        speed2+= 0.55;
					        } }
					        
					       
					        if(line1Y < (ypos+13) && line1Y > (ypos-13) && line1X < 113 && (line1X+line1_len) > 87){
					       line1X = 800;
					       score++;
					        line1Y = (float)Math.random()*350 + 50;
					        line1_len = (float)Math.random()*300 + 5; 
					        speed1+= 0.55;
					   }
					        
					    if(line2Y < (ypos+13) && line2Y > (ypos-13) && line2X < 113 && (line2X+line2_len) > 87){
					       line2X = 800;
					       score++;
					        line2Y = (float)Math.random()*350 + 50;
					        line2_len = (float)Math.random()*300 + 5; 
					        speed2+= 0.55;
					        }
					        
					        if(line1Y < (mult_Y+13) && line1Y > (mult_Y-13) && line1X < 113 && (line1X+line1_len) > 87){
					       line1X = 800;
					       score2++;
					        line1Y = (float)Math.random()*350 + 50;
					        line1_len = (float)Math.random()*300 + 5; 
					        speed1+= 0.55;
					   }
					        
					    if(line2Y < (mult_Y+13) && line2Y > (mult_Y-13) && line2X < 113 && (line2X+line2_len) > 87){
					       line2X = 800;
					       score2++;
					        line2Y = (float)Math.random()*350 + 50;
					        line2_len = (float)Math.random()*300 + 5; 
					        speed2+= 0.55;
					        }
					    }     
					    
					    if(!moving){
					    	friendC--;
					    stage=38;}
			 }
			 else 
				 stage=39;
		}
		
		if(stage==38) {
			background(0);
			image(rip, 30, 50);
		}
		
		if(stage==39) {
			background(0);
			image(success, 30, 50);
		}
		
		if(stage==40) {
			background(0);
			/*int u = (int) (Math.random()*10);
			if(u<=2) {
				unique1=true;friendC--;}
			
			int m = (int)(Math.random()*10);
			if(m<surviveC+2) {
				malaria1 = true;friendC--;}
			
			int r = (int)(Math.random()*10);
			if(r<surviveC+2) {
				running1 = true;friendC--;}
			
			int c = (int)(Math.random()*10);
			if(c<surviveC+2) {
				cannon1 = true;friendC--;}*/
			
			unique1=true;
			cannon1=true;
			friendC-=2;
			
			stage=41;
		}
		
		if(stage==41) {
			if(countera1 < 500 && unique1) {
				noStroke();
				background(0);
				if(playerRole==1)
					image(ui, 30, 50);
				else if(playerRole==2)
					image(ua, 30, 50);
				else if(playerRole ==3)
					image(uw, 30, 50);
				countera1++;
			}
			else {
				unique1=false;
				countera1=0;
				stage++;
			}
		}
		
		if(stage ==42) {
			if(countera2 < 500 && malaria1) {
				noStroke();
				background(0);
				image(mal, 30, 50);
				countera2++;
			}
			else {
				malaria1=false;
				countera2=0;
				stage++;
			}
		}
		
		if(stage ==43) {
			if(countera3 < 500 && running1) {
				noStroke();
				background(0);
				image(run, 20, 50);
				countera3++;
			}
			else {
				running1=false;
				countera3=0;
				stage++;
			}
		}
		
		if(stage ==44) {
			if(countera4 < 500 && cannon1) {
				noStroke();
				background(0);
				image(can, 60, 50);
				countera4++;
			}
			else {
				cannon1=false;
				countera4=0;
				stage++;
			}
		}
		
		if(stage ==45) {
			background(0);
			image(finalS, -30, 50);
		}
		
		if(stage ==46) {
			background(0);
			image(final2S, -30, 50);
		}
		
		if(stage ==47) {
			background(0);
			image(n1, 10, 100);
		}
		
		if(stage ==48) {
			background(0);
			image(n2, 10, 100);
		}
		
		if(stage ==49) {
			background(0);
			image(n3, 10, 100);
		}
		
		if(stage ==50) {
			background(0);
			image(n4, 10, 100);
		}
		
		if(stage ==51){
			background(0);
			image(gett, -20, 50);
		}
		
		if(stage==52) {
			background(0);
			image(three1, 30, 50);
		}
		if(stage==53) {
			background(0);
			image(three2, 30, 50);
		}
		if(stage==54){
			noStroke();
			 background(0);
			 image(maze, 15, 250);
			 image(note, 450, 50);
			 
			    // draw the paddle
			 if(dodgeCount < 2250) {
				 dodgeCount++;
				 fill(255, 0, 0);
				    noStroke();
				    rect(rect1x, rect1y, rect1w, rect1h);
				    rect(rect2x, rect2y, rect2w, rect2h);
				    rect(rect3x, rect3y, rect3w, rect3h);
				    rect(rect4x, rect4y, rect4w, rect4h);
				    rect(rect5x, rect5y, rect5w, rect5h);
				    rect(rect6x, rect6y, rect6w, rect6h);
				    rect(rect7x, rect7y, rect7w, rect7h);
				    
				    fill(255);
				    ellipse(roboX, roboY+30, roboW , roboH );
				    if(roboX + roboW > rect4x && roboX < rect4x + rect4w && roboY + roboH > rect4y && roboY < rect4y + rect4h || roboX + roboW > rect5x && roboX < rect5x +rect5w && roboY + roboH > rect5y && roboY < rect5y + rect5h || roboX + roboW > rect6x && roboX < rect6x +rect6w && roboY + roboH > rect6y && roboY < rect6y + rect6h || roboX + roboW > rect7x && roboX < rect7x + rect7w && roboY + roboH > rect7y && roboY < rect7y + rect7h || roboX + roboW > rect1x && roboX < rect1x + rect1w && roboY + roboH > rect1y && roboY < rect1y + rect1h || roboX + roboW > rect2x && roboX < rect2x + rect2w && roboY + roboH > rect2y && roboY < rect2y + rect2h || roboX + roboW > rect3x && roboX < rect3x + rect3w && roboY + roboH > rect3y && roboY < rect3y + rect3h) {
				        friendC--;
				        stage=55;
				    } 
				    
				    if(roboX > 400) {
				        stage=56;
				    }
			 }
			 else {
				 friendC--;
				 stage=55;
			 }
				 
		}
		
		if(stage==55) {
			background(0);
			image(rip, 30, 50);
		}
		
		if(stage==56) {
			background(0);
			image(success, 30, 50);
		}
		
		if(stage==57) {
			background(0);
			/*int u = (int) (Math.random()*10);
			if(u<=6) {
				unique2=true;friendC--;}
			
			int m = (int)(Math.random()*10);
			if(m<surviveC+2) {
				malaria2 = true;friendC--;}
			
			int r = (int)(Math.random()*10);
			if(r<surviveC+2) {
				running2 = true;friendC--;}
			
			int c = (int)(Math.random()*10);
			if(c<surviveC+2) {
				cannon2 = true;friendC--;}*/
			
			cannon2=true;
			running2=true;
			friendC-=2;
			
			stage=58;
		}
		
		if(stage==58) {
			if(counterb1 < 500 && unique2) {
				noStroke();
				background(0);
				if(playerRole==1)
					image(ui, 30, 50);
				else if(playerRole==2)
					image(ua, 30, 50);
				else if(playerRole ==3)
					image(uw, 30, 50);
				counterb1++;
			}
			else {
				unique2=false;
				counterb1=0;
				stage++;
			}
		}
		
		if(stage ==59) {
			if(counterb2 < 500 && malaria2) {
				noStroke();
				background(0);
				image(mal, 30, 50);
				counterb2++;
			}
			else {
				malaria2=false;
				counterb2=0;
				stage++;
			}
		}
		
		if(stage ==60) {
			if(counterb3 < 500 && running2) {
				noStroke();
				background(0);
				image(run, 20, 50);
				counterb3++;
			}
			else {
				running2=false;
				counterb3=0;
				stage++;
			}
		}
		
		if(stage ==61) {
			if(counter4 < 500 && cannon2) {
				noStroke();
				background(0);
				image(can, 60, 50);
				counter4++;
			}
			else {
				cannon2=false;
				counter4=0;
				stage++;
			}
		}
		
		if(stage ==62) {
			background(0);
			image(f1, 10, 50);
		}
		
		if(stage ==63) {
			background(0);
			image(f2, 10, 50);
		}
		if(stage ==64) {
			background(0);
			image(get, 10, 50);
		}
		
		if(stage ==65) {
			background(0);
			image(shT, -20, 50);
		}
		
		if(stage ==66) {
			background(0);
			image(s1, -20, 50);
		}
		if(stage ==67) {
			background(0);
			image(s2, -20, 50);
		}
		if(stage ==68) {
			background(0);
			image(s3, -20, 50);
		}
		
		if(stage ==69) {
			background(0);
			friendC--;
			image(mal, 30, 50);
		}
		if(stage ==70) {
			background(0);
			image(ir, 10, 50);
		}
		
		if(stage == 71) {
			background(0);
			image(ap, -10, 50);
		}
		
		if(stage == 72) {
			background(0);
			image(ap1, -30, 50);
		}
		
		if(stage == 73) {
			background(0);
			image(ap2, -30, 50);
		}
		
		if(stage == 74) {
			background(0);
			image(mead, -30, 100);
			
		}
		
		if(stage == 75) {
			background(0);
			if(friendC<0)
				image(die, 10, 50);
			
		else 
			image(surv, 10, 50);
		}
		
		if(stage == 76) {
			if(ac < 100) {
			background(0);
			image(a, 0, 0);ac++;}
			else 
				stage++;
		}
		
		if(stage == 77) {
			if(bc < 100) {
			background(0);
			image(b, 0, 0);bc++;}
			else 
				stage++;
		}
		
		if(stage == 78) {
			if(cc < 100) {
			background(0);
			image(c, 0, 0);cc++;}
			else 
				stage++;
		}
		
		if(stage==79) {
			if(dc < 100) {
			background(0);
			image(d, 0, 0);dc++;}
			else 
				stage++;
		}
		
		if(stage == 80) {
			background(0);
			image(end, 10, 50);
		}
		
		
	};
	
	
	public void keyPressed(){
		  if(key == '1' && stage ==7){
		    stage = 8;
		  }
		  else if(keyCode == RIGHT && stage==54) 
		        roboX += 3;
		  else if(keyCode == DOWN && stage==54) 
		        roboY += 3;
		  else if(keyCode == LEFT&&stage==54) 
		        roboX -= 3;
		  else if(keyCode == UP &&stage==54) 
		        roboY -= 3;
		  else if (key == '2' && stage ==7){
		    stage = 9;
		  }
		  else if(key == ' ' && stage ==9)
			  stage = 10;
		  else if(key == ' ' && stage ==10)
			  stage = 11;
		  else if(key == ' ' && stage ==11)
			  stage = 7;
		  else if(key == '4' && stage ==8)
			  stage = 12;
		  else if(key == ' ' && stage ==12)
			  stage = 13;
		  else if(key == ' ' && stage ==13)
			  stage = 14;
		  else if(key == ' ' && stage ==14)
			  stage = 8;
		  else if(key == '1' && stage ==8) {
			  playerRole =1; surviveC = 3; stage=15;}
		  else if(key == '2' && stage ==8) {
			  playerRole = 2; surviveC = 2; stage=15;}
		  else if(key == '3' && stage ==8) {
			  playerRole =3; surviveC = 1; stage=15; }
		  else if((key == ' '|| key == 'y' || key == 'Y')&& stage ==15)
			  stage = 16;
		  else if(key == ' ' && stage ==16)
			  stage = 17;
		  else if(key == ' ' && stage ==17)
			  stage = 21;
		  else if(key == ' ' && stage==21)
			  stage =22;
		  else if(key == ' ' && stage==22)
			  stage =23;
		  else if(key == ' ' && stage==23)
			  stage =20;
		  else if(key == ' ' && stage==20)
			  stage =24;
		  else if(key == ' ' && stage==24)
			  stage =25;
		  else if(key == ' ' && stage==25)
			  stage =26;
		  else if(key == ' ' && stage==26)
			  stage =18;
		  else if(key == ' ' && stage==27 || stage==28)
			  stage = 19;
		  else if(key == ' ' && stage==33)
			  stage = 34;
		  else if(key == ' ' && stage==34)
			  stage = 35;
		  else if(key == ' ' && stage==35)
			  stage = 36;
		  else if(key == ' ' && stage==36)
			  stage = 37;
		  else if(key == ' ' && stage==38 || stage ==39)
			  stage = 40;
		  else if(key == ' ' && stage==45)
			  stage = 46;
		  else if(key == ' ' && stage==46)
			  stage = 47;
		  else if(key == ' ' && stage==47)
			  stage = 48;
		  else if(key == ' ' && stage==48)
			  stage = 49;
		  else if(key == ' ' && stage==49)
			  stage = 50;
		  else if(key == ' ' && stage==50)
			  stage = 51;
		  else if(key == ' ' && stage==51)
			  stage = 52;
		  else if(key == ' ' && stage==52)
			  stage = 53;
		  else if(key == ' ' && stage==53)
			  stage = 54;
		  else if(key == ' ' && stage==55 || stage ==56)
			  stage = 57;
		  else if(key == ' ' && stage==62)
			  stage = 63;
		  else if(key == ' ' && stage==63)
			  stage = 64;
		  else if(key == ' ' && stage==64)
			  stage = 65;
		  else if(key == ' ' && stage==65)
			  stage = 66;
		  else if(key == ' ' && stage==66)
			  stage = 67;
		  else if(key == ' ' && stage==67)
			  stage = 68;
		  else if(key == ' ' && stage==68)
			  stage = 69;
		  else if(key == ' ' && stage==69)
			  stage = 70;
		  else if(key == ' ' && stage==70)
			  stage = 71;
		  else if(key == ' ' && stage==71)
			  stage = 72;
		  else if(key == ' ' && stage==72)
			  stage = 73;
		  else if(key == ' ' && stage==73)
			  stage = 74;
		  else if(key == ' ' && stage==74)
			  stage = 75;
		  else if(key == ' ' && stage==75)
			  stage = 76;
		  
		  
		  
		  /*else if(key == ' ' && stage ==17)
			  stage = 20;
		  else if(key == ' ' && stage ==20)
			  stage = 18;*/
		  
		  
		  
	};

	public void mouseClicked() {
	    if (!ballMoving && stage==18) {
	        // reset the ball speed
	        ballSpeedX = initialSpeedX;
	        ballSpeedY = initialSpeedY;
	        
	        ballMoving = true;
	    }
	};
	

}
