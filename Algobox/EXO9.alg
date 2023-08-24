<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description courant="FIN_SINON" texte=""/>
    <extension extnom="inactif"/>
    <fonction fctetat="inactif" fctcode=""/>
    <F2 F2defaut="" F2para="" F2lignes="" F2etat="inactif"/>
    <repere repetat="inactif" repcode="-10#10#-10#10#2#2"/>
    <param maxBoucle="500000" totalAffichages="1000" totalBoucles="5000000" epaisseurPoint="2" arrondiAuto="vrai" epaisseurLigne="2" nbDecimales="8"/>
    <item code="200#declarationfonctions" algoitem="FONCTIONS_UTILISEES"/>
    <item code="100#declarationsvariables" algoitem="VARIABLES">
        <item code="1#NOMBRE#Height" algoitem="Height EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#Weight" algoitem="Weight EST_DU_TYPE NOMBRE"/>
    </item>
    <item code="101#debutalgo" algoitem="DEBUT_ALGORITHME">
        <item code="4#Veuillez renseigner votre taille (en cm) #0" algoitem="AFFICHER &quot;Veuillez renseigner votre taille (en cm) &quot;"/>
        <item code="2#Height#pasliste" algoitem="LIRE Height"/>
        <item code="4#Veuillez renseigner votre poids (en kg) #0" algoitem="AFFICHER &quot;Veuillez renseigner votre poids (en kg) &quot;"/>
        <item code="2#Weight#pasliste" algoitem="LIRE Weight"/>
        <item code="6#Height>=145 &amp;&amp; Height&lt;=169 &amp;&amp; Weight>=43 &amp;&amp; Weight&lt;=47||Height>=145 &amp;&amp; Height&lt;=166 &amp;&amp; Weight>=48 &amp;&amp; Weight&lt;=53||Height>=145 &amp;&amp; Height&lt;=163 &amp;&amp; Weight>=54 &amp;&amp; Weight&lt;=59||Height>=145 &amp;&amp; Height&lt;=160 &amp;&amp; Weight>=60 &amp;&amp; Weight&lt;=65 " algoitem="SI (Height>=145 &amp;&amp; Height&lt;=169 &amp;&amp; Weight>=43 &amp;&amp; Weight&lt;=47||Height>=145 &amp;&amp; Height&lt;=166 &amp;&amp; Weight>=48 &amp;&amp; Weight&lt;=53||Height>=145 &amp;&amp; Height&lt;=163 &amp;&amp; Weight>=54 &amp;&amp; Weight&lt;=59||Height>=145 &amp;&amp; Height&lt;=160 &amp;&amp; Weight>=60 &amp;&amp; Weight&lt;=65 ) ALORS">
            <item code="7#debutsi" algoitem="DEBUT_SI"/>
            <item code="4#La taille 1 devrait vous convenir#0" algoitem="AFFICHER &quot;La taille 1 devrait vous convenir&quot;"/>
            <item code="8#finsi" algoitem="FIN_SI"/>
            <item code="9#sinon" algoitem="SINON">
                <item code="10#debutsinon" algoitem="DEBUT_SINON"/>
                <item code="6#Height>=169 &amp;&amp; Height&lt;=178 &amp;&amp; Weight>=48 &amp;&amp; Weight&lt;=53||Height>=166 &amp;&amp; Height&lt;=175 &amp;&amp; Weight>=54 &amp;&amp; Weight&lt;=59||Height>=163 &amp;&amp; Height&lt;=172 &amp;&amp; Weight>=60 &amp;&amp; Weight&lt;=65||Height>=160 &amp;&amp; Height&lt;=169 &amp;&amp; Weight>=66 &amp;&amp; Weight&lt;=71" algoitem="SI (Height>=169 &amp;&amp; Height&lt;=178 &amp;&amp; Weight>=48 &amp;&amp; Weight&lt;=53||Height>=166 &amp;&amp; Height&lt;=175 &amp;&amp; Weight>=54 &amp;&amp; Weight&lt;=59||Height>=163 &amp;&amp; Height&lt;=172 &amp;&amp; Weight>=60 &amp;&amp; Weight&lt;=65||Height>=160 &amp;&amp; Height&lt;=169 &amp;&amp; Weight>=66 &amp;&amp; Weight&lt;=71) ALORS">
                    <item code="7#debutsi" algoitem="DEBUT_SI"/>
                    <item code="4#La taille 2 devrait vous convenir#0" algoitem="AFFICHER &quot;La taille 2 devrait vous convenir&quot;"/>
                    <item code="8#finsi" algoitem="FIN_SI"/>
                    <item code="9#sinon" algoitem="SINON">
                        <item code="10#debutsinon" algoitem="DEBUT_SINON"/>
                        <item code="6#Height>=178 &amp;&amp; Height&lt;=183 &amp;&amp; Weight>=54 &amp;&amp; Weight&lt;=59||Height>=175 &amp;&amp; Height&lt;=183 &amp;&amp; Weight>=60 &amp;&amp; Weight&lt;=65||Height>=172 &amp;&amp; Height&lt;=183 &amp;&amp; Weight>=66 &amp;&amp; Weight&lt;=71||Height>=163 &amp;&amp; Height&lt;=183 &amp;&amp; Weight>=72 &amp;&amp; Weight&lt;=77" algoitem="SI (Height>=178 &amp;&amp; Height&lt;=183 &amp;&amp; Weight>=54 &amp;&amp; Weight&lt;=59||Height>=175 &amp;&amp; Height&lt;=183 &amp;&amp; Weight>=60 &amp;&amp; Weight&lt;=65||Height>=172 &amp;&amp; Height&lt;=183 &amp;&amp; Weight>=66 &amp;&amp; Weight&lt;=71||Height>=163 &amp;&amp; Height&lt;=183 &amp;&amp; Weight>=72 &amp;&amp; Weight&lt;=77) ALORS">
                            <item code="7#debutsi" algoitem="DEBUT_SI"/>
                            <item code="4#La taille 3 devrait vous convenir#0" algoitem="AFFICHER &quot;La taille 3 devrait vous convenir&quot;"/>
                            <item code="8#finsi" algoitem="FIN_SI"/>
                            <item code="9#sinon" algoitem="SINON">
                                <item code="10#debutsinon" algoitem="DEBUT_SINON"/>
                                <item code="4#Quelle genre de créature êtes vous?#0" algoitem="AFFICHER &quot;Quelle genre de créature êtes vous?&quot;"/>
                                <item code="11#finsinon" algoitem="FIN_SINON"/>
                            </item>
                        </item>
                        <item code="11#finsinon" algoitem="FIN_SINON"/>
                    </item>
                </item>
                <item code="11#finsinon" algoitem="FIN_SINON"/>
            </item>
        </item>
    </item>
    <item code="102#finalgo" algoitem="FIN_ALGORITHME"/>
</Algo>
