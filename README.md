# Conversor de Moedas
# Praticando Java: Challenge conversor de moedas

Este é um simples conversor de moedas desenvolvido em Java que permite aos usuários converter valores entre diferentes moedas, como Dólar Americano (USD), Real Brasileiro (BRL), Dólar Mexicano (MXN) e Dólar Canadense (CAD).

## Funcionalidades

O conversor oferece as seguintes opções:

1.  **Dólar Americano => Real Brasileiro**
2.  **Real Brasileiro => Dólar Americano**
3.  **Dólar Americano => Dólar Mexicano**
4.  **Dólar Mexicano => Dólar Americano**
5.  **Dólar Americano => Dólar Canadense**
6.  **Dólar Canadense => Dólar Americano**
7.  **Sair**

O usuário digita o valor a ser convertido e o programa exibe o valor resultante na moeda de destino.

## Como Usar

1.  **Pré-requisitos:**
    * Java Development Kit (JDK) instalado no seu sistema.

2.  **Compilação e Execução:**
    * Salve os arquivos `.java` (por exemplo, `PrincipalConversorDeMoelada.java`, `ConsultaCotacao.java`, `Moeda.java`) na mesma pasta.
    * Abra o terminal ou prompt de comando, navegue até a pasta onde os arquivos foram salvos e compile os arquivos Java usando o comando:
        ```bash
        javac PrincipalConversorDeMoelada.java ConsultaCotacao.java Moeda.java
        ```
    * Após a compilação bem-sucedida, execute o programa principal com o comando:
        ```bash
        java PrincipalConversorDeMoelada
        ```
    * O programa exibirá um menu de opções. Digite o número da opção desejada e siga as instruções.

## Estrutura do Projeto

O projeto consiste nas seguintes classes:

* **`PrincipalConversorDeMoelada.java`:** A classe principal que contém o método `main` e a lógica de interação com o usuário, exibindo o menu e realizando as conversões.
* **`ConsultaCotacao.java`:** (Esta classe precisa ser implementada) Responsável por buscar as taxas de câmbio das diferentes moedas. Atualmente, a lógica de busca de cotações não está detalhada no código fornecido.
* **`Moeda.java`:** (Esta classe precisa ser implementada) Representa um valor em uma determinada moeda e armazena o resultado da conversão. Deve conter atributos como moeda original, moeda de destino, valor original, taxa de câmbio e valor convertido, além do método `toString()` para exibir o resultado formatado.

## Observações

* A classe `ConsultaCotacao` é essencial para buscar as taxas de câmbio atualizadas. No código fornecido, a implementação dessa busca não está presente, o que significa que as conversões podem não refletir valores reais do mercado.
* A classe `Moeda` deve estar implementada corretamente, incluindo o método `toString()` para formatar a saída da conversão.

## Próximos Passos (Melhorias Sugeridas)

* **Implementar a classe `ConsultaCotacao`:** Utilizar uma API externa [https://www.exchangerate-api.com] para obter as taxas de câmbio em tempo real.
* **Adicionar mais opções de moedas:** Expandir o conversor para suportar outras moedas.
* **Melhor tratamento de erros:** Implementar tratamento de erros mais robusto para entradas inválidas e falhas na busca de cotações.
* **Interface gráfica:** Desenvolver uma interface gráfica de usuário (GUI) para uma melhor experiência do usuário.
* **Persistência:** Adicionar a capacidade de salvar as últimas taxas de câmbio consultadas.

## Autor
**Jeferson Romanini** 

[Praticando Java: Challenge conversor de moedas]