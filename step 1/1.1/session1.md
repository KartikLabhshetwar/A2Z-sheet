## learned difference between input/ outputs.

the main things was buffered reader and scanner object.\
use bufferreader when you are solving problem as it will reduce the time complexity.

# Java.io.BufferedReader Class in Java

Reads text from a character-input stream, buffering characters so as to provide for the efficient reading of characters, arrays, and lines. The buffer size may be specified, or the default size may be used. The default is large enough for most purposes. In general, each read request made by a Reader causes a corresponding read request to be made of the underlying character or byte stream. It is therefore advisable to wrap a BufferedReader around any Reader whose read() operations may be costly, such as FileReaders and InputStreamReaders. Programs that use DataInputStreams for textual input can be localized by replacing each DataInputStream with an appropriate BufferedReader.

Constructors of BufferedReader Class 

- BufferedReader(Reader in):	Creates a buffering character-input stream that uses a default-sized input buffer

- BufferedReader(Reader in, int sz):	Creates a buffering character-input stream that uses an input buffer of the specified size.

Methods of BufferedReader Class


- close()	: Closes the stream and releases any system resources associated with it.Once the stream has been closed, further read(), ready(), mark(), reset(), or skip() invocations will throw an IOException. Closing a previously closed stream has no effect.

- mark():	Marks the present position in the stream. Subsequent calls to reset() will attempt to reposition the stream to this point.

- markSupported(): Tells whether this stream supports the mark() operation, which it does.

- read():	Reads a single character.

- read(char[] cbuf, int off, int len):	Reads characters into a portion of an array. This method implements the general contract of the corresponding read method of the Reader class. As an additional convenience, it attempts to read as many characters as possible by repeatedly invoking the read method of the underlying stream.

- readLine()	Reads a line of text. A line is considered to be terminated by any one of a line feed (‘\n’), a carriage return (‘\r’), or a carriage return followed immediately by a line feed.

- ready()	Tells whether this stream is ready to be read.
- reset()	Resets the stream to the most recent mark.
- skip(long)	Skips characters.


Implementation: The content inside the file is as follows:

This is first line\
this is second line

Example



```
// Java Program to Illustrate BufferedReader Class 
// Via Its Methods 
  
// Importing required classes 
import java.io.BufferedReader; 
import java.io.FileReader; 
import java.io.IOException; 
  
// Class 
class GFG { 
  
    // Main driver method 
    public static void main(String[] args) 
        throws IOException 
    { 
  
        // Creating object of FileReader and BufferedReader 
        // class 
        FileReader fr = new FileReader("file.txt"); 
        BufferedReader br = new BufferedReader(fr); 
  
        char c[] = new char[20]; 
  
        // Illustrating markSupported() method 
        if (br.markSupported()) { 
  
            // Print statement 
            System.out.println( 
                "mark() method is supported"); 
  
            // Illustrating mark method 
            br.mark(100); 
        } 
  
        // File Contents is as follows: 
        // This is first line 
        // this is second line 
  
        // Skipping 8 characters 
        br.skip(8); 
  
        // Illustrating ready() method 
        if (br.ready()) { 
  
            // Illustrating readLine() method 
            System.out.println(br.readLine()); 
  
            // Illustrating read(char c[],int off,int len) 
            br.read(c); 
  
            for (int i = 0; i < 20; i++) { 
                System.out.print(c[i]); 
            } 
  
            System.out.println(); 
  
            // Illustrating reset() method 
            br.reset(); 
            for (int i = 0; i < 8; i++) { 
  
                // Illustrating read() method 
                System.out.print((char)br.read()); 
            } 
        } 
    } 
}

```
Output:

mark() method is supported\
first line\
this is second line\
This is\




