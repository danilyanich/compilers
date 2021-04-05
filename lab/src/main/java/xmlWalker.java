public class xmlWalker extends xmlBaseListener {
        public void enterInitialise_var(xmlParser.Initialise_varContext ctx ) {
            System.out.println( "Creating var:" + ctx.NAME() + " with type " + ctx.TYPE(0));
        }

        public void exitInitialise_var(xmlParser.Initialise_varContext ctx ) {
            System.out.println( "Exiting rule" );
        }
}
