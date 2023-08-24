<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description courant="FIN_POUR" texte=""/>
    <extension extnom="inactif"/>
    <fonction fctcode="" fctetat="inactif"/>
    <F2 F2lignes="" F2etat="inactif" F2para="" F2defaut=""/>
    <repere repcode="-10#10#-10#10#2#2" repetat="inactif"/>
    <param maxBoucle="500000" epaisseurPoint="2" epaisseurLigne="2" totalBoucles="5000000" totalAffichages="1000" nbDecimales="8" arrondiAuto="vrai"/>
    <item code="200#declarationfonctions" algoitem="FONCTIONS_UTILISEES"/>
    <item code="100#declarationsvariables" algoitem="VARIABLES">
        <item code="1#NOMBRE#User_Nb" algoitem="User_Nb EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#i" algoitem="i EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#Somme" algoitem="Somme EST_DU_TYPE NOMBRE"/>
    </item>
    <item code="101#debutalgo" algoitem="DEBUT_ALGORITHME">
        <item code="4#Donnez moi un nombre entier#0" algoitem="AFFICHER &quot;Donnez moi un nombre entier&quot;"/>
        <item code="2#User_Nb#pasliste" algoitem="LIRE User_Nb"/>
        <item code="12#i#1#User_Nb" algoitem="POUR i ALLANT_DE 1 A User_Nb">
            <item code="13#debutpour" algoitem="DEBUT_POUR"/>
            <item code="19#User_Nb PREND_LA_VALEUR User_Nb+i" algoitem="//User_Nb PREND_LA_VALEUR User_Nb+i"/>
            <item code="6#i&lt;User_Nb" algoitem="SI (i&lt;User_Nb) ALORS">
                <item code="7#debutsi" algoitem="DEBUT_SI"/>
                <item code="3#i#0#pasliste" algoitem="AFFICHER i"/>
                <item code="4# + #0" algoitem="AFFICHER &quot; + &quot;"/>
                <item code="8#finsi" algoitem="FIN_SI"/>
                <item code="9#sinon" algoitem="SINON">
                    <item code="10#debutsinon" algoitem="DEBUT_SINON"/>
                    <item code="6#i=User_Nb" algoitem="SI (i=User_Nb) ALORS"/>
                    <item code="3#i#0#pasliste" algoitem="AFFICHER i"/>
                    <item code="4# = #0" algoitem="AFFICHER &quot; = &quot;"/>
                    <item code="3#Somme#0#pasliste" algoitem="AFFICHER Somme"/>
                    <item code="11#finsinon" algoitem="FIN_SINON"/>
                </item>
            </item>
            <item code="5#Somme#Somme+User_Nb#pasliste" algoitem="Somme PREND_LA_VALEUR Somme+User_Nb"/>
            <item code="14#finpour" algoitem="FIN_POUR"/>
        </item>
    </item>
    <item code="102#finalgo" algoitem="FIN_ALGORITHME"/>
</Algo>
