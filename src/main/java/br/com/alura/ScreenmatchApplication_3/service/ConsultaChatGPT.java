package br.com.alura.ScreenmatchApplication_3.service;

import com.theokanning.openai.completion.CompletionRequest;
import com.theokanning.openai.service.OpenAiService;

public class ConsultaChatGPT {
    public static String obterTraducao(String texto) {
        OpenAiService service = new OpenAiService("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");

        CompletionRequest requisicao = CompletionRequest.builder()
                .model("gpt-3.5-turbo-instruct")
                .prompt("traduza para o português o texto: " + texto)
                .maxTokens(1000)
                .temperature(0.7)
                .build();

        var resposta = service.createCompletion(requisicao);
        return resposta.getChoices().get(0).getText();
    }
}
