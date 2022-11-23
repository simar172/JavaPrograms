package palin;

import com.sun.speech.freetts.Voice;  
import com.sun.speech.freetts.VoiceManager;  
public class TextToSpeechExample3  
{  
public static void main(String args[])   
{  
  
Voice voice;  

voice = VoiceManager.getInstance().getVoice("kevin");  
if (voice != null)   
{  

voice.allocate();  
}  
try   
{  
voice.setRate(190);  
voice.setPitch(150);  
voice.setVolume(10);   
voice.speak("simar");  
}  
catch(Exception e)  
{  
e.printStackTrace();  
}  
}  
}  