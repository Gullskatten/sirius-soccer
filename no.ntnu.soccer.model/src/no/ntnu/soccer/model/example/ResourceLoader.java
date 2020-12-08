package no.ntnu.soccer.model.example;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import no.ntnu.soccer.model.soccer.SoccerPackage;

public class ResourceLoader {
    public static void main(String[] args) {
        ResourceSet set = new ResourceSetImpl();
        set.getPackageRegistry().put(SoccerPackage.eINSTANCE.getNsPrefix(), SoccerPackage.eINSTANCE);
        set.getResourceFactoryRegistry().getExtensionToFactoryMap().put("soccer", new XMIResourceFactoryImpl());
    }
}
