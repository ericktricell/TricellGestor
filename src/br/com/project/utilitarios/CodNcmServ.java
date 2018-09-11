/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.project.utilitarios;

import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Eu
 */
public class CodNcmServ {

    private String codncmtest;

    public CodNcmServ() {
        codncmtest = "[\n"
                + " {\n"
                + "   \"codigo\": \"90049090\",\n"
                + "   \"descricao_completa\": \"Óculos para correção, proteção ou outros fins, e artigos semelhantes. Outros Outros\",\n"
                + "   \"capitulo\": \"90\",\n"
                + "   \"posicao\": \"04\",\n"
                + "   \"subposicao1\": \"9\",\n"
                + "   \"subposicao2\": \"0\",\n"
                + "   \"item1\": \"9\",\n"
                + "   \"item2\": \"0\"\n"
                + " },\n"
                + " {\n"
                + "   \"codigo\": \"90051000\",\n"
                + "   \"descricao_completa\": \"Binóculos, lunetas, incluindo as astronômicas, telescópios ópticos, e suas armações, outros instrumentos de astronomia e suas armações, exceto os aparelhos de radioastronomia. Binóculos\",\n"
                + "   \"capitulo\": \"90\",\n"
                + "   \"posicao\": \"05\",\n"
                + "   \"subposicao1\": \"1\",\n"
                + "   \"subposicao2\": \"0\",\n"
                + "   \"item1\": \"0\",\n"
                + "   \"item2\": \"0\"\n"
                + " },\n"
                + " {\n"
                + "   \"codigo\": \"90058000\",\n"
                + "   \"descricao_completa\": \"Binóculos, lunetas, incluindo as astronômicas, telescópios ópticos, e suas armações, outros instrumentos de astronomia e suas armações, exceto os aparelhos de radioastronomia. Outros instrumentos\",\n"
                + "   \"capitulo\": \"90\",\n"
                + "   \"posicao\": \"05\",\n"
                + "   \"subposicao1\": \"8\",\n"
                + "   \"subposicao2\": \"0\",\n"
                + "   \"item1\": \"0\",\n"
                + "   \"item2\": \"0\"\n"
                + " },\n"
                + " {\n"
                + "   \"codigo\": \"90059010\",\n"
                + "   \"descricao_completa\": \"Binóculos, lunetas, incluindo as astronômicas, telescópios ópticos, e suas armações, outros instrumentos de astronomia e suas armações, exceto os aparelhos de radioastronomia. Partes e acessórios (incluindo as armações) De binóculos\",\n"
                + "   \"capitulo\": \"90\",\n"
                + "   \"posicao\": \"05\",\n"
                + "   \"subposicao1\": \"9\",\n"
                + "   \"subposicao2\": \"0\",\n"
                + "   \"item1\": \"1\",\n"
                + "   \"item2\": \"0\"\n"
                + " }\n"
                + "]";

    }

    public List<CodNcm> listCodNcm() {
        List<CodNcm> cNcm = new ArrayList<>();
        Gson gson = new Gson();
        CodNcm[] cn = gson.fromJson(codncmtest, CodNcm[].class);
        for(int i = 0; i < cn.length; i++)
            cNcm.add(cn[i]);
        return cNcm;
    }
}
