	module MyProgramC @safe() {
	uses interface Leds;
	uses interface Boot;
	uses interface Timer<TMilli> as AllLedBlink;
	uses interface Timer<TMilli> as RedLedBlink;
	
	}
	implementation {
	   /* nesc code */
		uint8_t counter = 0;
	
	
		 task void ledCounter() {
	  /* task content */
	   ask void ledCounter() {
			uint8_t i;
			for (i = 0; i < 10; i++) {
				counter++;
				if (counter > 5)
				{
					// %u is used to print the uint8_t while %ul is used to print uint32_t
					printf("Here, The Led Counter is more > than 5: Counter= %u\n", i);
				}
				else{
					printf("Here, The Led Counter is less < than 5: Counter= %u\n", i);
				}
			}
		
	 }
	
	    event void Boot.booted() {
	   /* event content */
	   
			dbg("Boot,MyProgramC", "Application booted.\n");
			call AllLedBlink.startPeriodic(250);
			call RedLedBlink.startPeriodic(500);
		
	 }
	    event void AllLedBlink.fired() {
	   /* event content */
	   
			printf("Hi, The application fired the timer of AllLedBlink event\n");
			
			// The Tree LEDs will toggle on.
			call Leds.led0Toggle();
			call Leds.led1Toggle();
			call Leds.led2Toggle();
			printf("Hi, Here the event called and turn on the tree LEDs\n");
		
	 }
	    event void RedLedBlink.fired() {
	   /* event content */
	   
			call Leds.led0Toggle();
			post ledCounter();
			printf("The Red Led Blink Event\n");
			dbg("MyProgramC", "Red Led Blink\n");
		
	 }
	
	}
	
	
	
