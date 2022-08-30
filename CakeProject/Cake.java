package CakeProject;
public class Cake {
    int tiers;

    public Cake()
    {
        tiers = 1;
        
        System.out.println("   ,,,\n   |||\n(~~~~~~~)\n(       )\n(~~~~~~~)\n");
    }
    
    public Cake(int t) 
    {
        tiers = t;
    
        System.out.println("      ,,,\n      |||\n  (**********)\n  (*        *)\n  (*        *)");
        System.out.println("(**************)\n(*            *)\n(*            *)\n(**************)\n");
    }
    
    public Cake(double t) { 
        tiers = (int)t;

        System.out.println("        ,,,\n        |||\n    (**********)\n    (*        *)\n    (*        *)");
        System.out.println("  (**************)\n  (*            *)\n  (*            *)");
        System.out.println("(******************)\n(*                *)\n(*                *)\n(******************)\n");
    }
}
