/*
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 * The Federal Office of Administration (Bundesverwaltungsamt, BVA)
 * licenses this file to you under the Apache License, Version 2.0 (the
 * License). You may not use this file except in compliance with the
 * License. You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package de.bund.bva.isyfact.aufrufkontext.impl;

import de.bund.bva.isyfact.aufrufkontext.AufrufKontext;
import de.bund.bva.isyfact.aufrufkontext.AufrufKontextVerwalter;

/**
 * Stellt einer Anwendung den AufrufKontext bereit.
 *
 *
 */
public class AufrufKontextVerwalterImpl<T extends AufrufKontext> implements AufrufKontextVerwalter<T> {

    /** der aktuelle AufrufKontext. */
    private T aufrufKontext;

    /**
     * Liefert das Feld 'aufrufKontext' zurück.
     * @return Wert von aufrufKontext
     */
    @Override
    public T getAufrufKontext() {
        return aufrufKontext;
    }

    /**
     * Setzt das Feld 'aufrufKontext'.
     * @param aufrufKontext Neuer Wert für aufrufKontext
     */
    @Override
    public void setAufrufKontext(T aufrufKontext) {
        this.aufrufKontext = aufrufKontext;
    }

}
