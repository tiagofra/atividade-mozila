# Navegador e Sistema Hospitalar

## Descrição

Este projeto consiste em dois sistemas distintos:

1. **Navegador**: Simula a navegação em páginas web utilizando pilhas, permitindo ao usuário acessar, voltar e avançar entre páginas.
2. **Sistema Hospitalar**: Simula a geração e o atendimento de senhas em um hospital, usando uma fila para gerenciar a ordem de atendimento.

Ambos os programas fazem uso de estruturas de dados como pilhas e filas para resolver problemas práticos.

## Funcionalidades

### Navegador
- **Acessar página**: Adiciona a página atual à pilha de páginas anteriores e limpa a pilha de páginas futuras.
- **Voltar**: Retorna à página anterior da pilha.
- **Avançar**: Avança para a próxima página armazenada na pilha de páginas futuras.
- **Exibir estado**: Mostra o status atual da navegação.

### Sistema Hospitalar
- **Gerar senha**: Gera uma nova senha sequencial e adiciona à fila.
- **Chamar próxima senha**: Chama a próxima senha da fila e exibe no sistema.
- **Histórico**: Exibe as senhas geradas e chamadas.

## Tecnologias

- **Java**
- **Swing** (para a interface gráfica)
- **Estruturas de dados**: Pilha (Stack) e Fila (Queue)

## Testes

- **Navegador**:
  - Testado acesso a nova página, voltar, avançar e navegação completa.
- **Sistema Hospitalar**:
  - Testados os métodos de geração de senhas, chamada da próxima senha, fila vazia e interação com a interface gráfica.

## Execução

Para rodar os programas, basta compilar o código Java e executar as classes correspondentes. Ambos os sistemas possuem interface gráfica interativa.

## Conclusão

O trabalho demonstrou a aplicação de estruturas de dados como pilhas e filas para resolver problemas práticos em sistemas como navegação na web e gerenciamento de senhas em hospitais.

## Bibliografia

- [Documentação do Java](https://docs.oracle.com/javase/)
- [Java Stack - GeeksforGeeks](https://www.geeksforgeeks.org/stack-data-structure/)
- [Java Swing Tutorial - Oracle](https://docs.oracle.com/javase/tutorial/uiswing/)
- [CFB Cursos - Como usar Pilha em Java (2021)](https://www.youtube.com/watch?v=nRKZ4SdYfXo)
