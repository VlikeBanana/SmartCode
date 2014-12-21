public class SystemProperties
{
  public static void main( String[] args )
  {
    System.out.println( System.getProperties().toString().replace( ',', '\n' )
                                                         .replace( '{', ' '  )
                                                         .replace( '}', ' '  ) );
  }
}
