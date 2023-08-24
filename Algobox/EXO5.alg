<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description texte="" courant="AFFICHER &quot; euros.&quot;"/>
    <extension extnom="inactif"/>
    <fonction fctcode="" fctetat="inactif"/>
    <F2 F2lignes="" F2para="" F2defaut="" F2etat="inactif"/>
    <repere repcode="-10#10#-10#10#2#2" repetat="inactif"/>
    <param totalBoucles="5000000" totalAffichages="1000" arrondiAuto="vrai" nbDecimales="8" epaisseurLigne="2" epaisseurPoint="2" maxBoucle="500000"/>
    <item algoitem="FONCTIONS_UTILISEES" code="200#declarationfonctions"/>
    <item algoitem="VARIABLES" code="100#declarationsvariables">
        <item algoitem="nbPhotocopies EST_DU_TYPE NOMBRE" code="1#NOMBRE#nbPhotocopies"/>
    </item>
    <item algoitem="DEBUT_ALGORITHME" code="101#debutalgo">
        <item algoitem="AFFICHER &quot;Combien de photocopies voulez-vous ? &quot;" code="4#Combien de photocopies voulez-vous ? #0"/>
        <item algoitem="LIRE nbPhotocopies" code="2#nbPhotocopies#pasliste"/>
        <item algoitem="AFFICHER &quot;Pour &quot;" code="4#Pour #0"/>
        <item algoitem="AFFICHER nbPhotocopies" code="3#nbPhotocopies#0#pasliste"/>
        <item algoitem="AFFICHER &quot; photocopie(s), vous devrez payer &quot;" code="4# photocopie(s), vous devrez payer #0"/>
        <item algoitem="SI (nbPhotocopies &lt; 10) ALORS" code="6#nbPhotocopies &lt; 10">
            <item algoitem="DEBUT_SI" code="7#debutsi"/>
            <item algoitem="AFFICHERCALCUL nbPhotocopies * 0.5" code="20#nbPhotocopies * 0.5#0"/>
            <item algoitem="FIN_SI" code="8#finsi"/>
            <item algoitem="SINON" code="9#sinon">
                <item algoitem="DEBUT_SINON" code="10#debutsinon"/>
                <item algoitem="SI (nbPhotocopies &lt; 20) ALORS" code="6#nbPhotocopies &lt; 20">
                    <item algoitem="DEBUT_SI" code="7#debutsi"/>
                    <item algoitem="AFFICHERCALCUL nbPhotocopies * 0.4" code="20#nbPhotocopies * 0.4#0"/>
                    <item algoitem="FIN_SI" code="8#finsi"/>
                    <item algoitem="SINON" code="9#sinon">
                        <item algoitem="DEBUT_SINON" code="10#debutsinon"/>
                        <item algoitem="AFFICHERCALCUL nbPhotocopies * 0.3" code="20#nbPhotocopies * 0.3#0"/>
                        <item algoitem="FIN_SINON" code="11#finsinon"/>
                    </item>
                </item>
                <item algoitem="FIN_SINON" code="11#finsinon"/>
            </item>
        </item>
        <item algoitem="AFFICHER &quot; euros.&quot;" code="4# euros.#1"/>
    </item>
    <item algoitem="FIN_ALGORITHME" code="102#finalgo"/>
</Algo>
