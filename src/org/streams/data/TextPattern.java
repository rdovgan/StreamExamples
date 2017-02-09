package org.streams.data;

/**
 * Created by rdovgan on 09.02.2017.
 */
public class TextPattern {

	public static final String COMMA_SEPARATED_ALPHABET = "a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z";

	public static final String TEXT_ABOUT_JAVA = "The only difference between the serial and parallel versions of this example is the creation of the "
			+ "initial stream, using \"parallelStream()\" instead of \"stream()\". When the terminal operation is initiated, the stream pipeline is executed s"
			+ "equentially or in parallel depending on the orientation of the stream on which it is invoked. Whether a stream will execute in serial or parall"
			+ "el can be determined with the isParallel() method, and the orientation of a stream can be modified with the BaseStream.sequential() and BaseStr"
			+ "eam.parallel() operations. When the terminal operation is initiated, the stream pipeline is executed sequentially or in parallel depending on t"
			+ "he mode of the stream on which it is invoked.";

}
