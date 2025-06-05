# Projeto Final POO E-commerce
## Descrição do problema
- Implemente um projeto de e-commerce utilizando Java e os conceitos de POO aprendidos em sala de aula.
- Siga as instruções abaixo e implemente todas as funcionalidades requisitadas. Utilize conceitos de instanciação, classes, ArrayLists, herança, sobrecarga, sobrescrita, agregação, associação, composição e Interfaces (abstração). A identicação das classes e seus relacionamentos faz parte do processo de interpretação do problema. Será avaliado o uso de todos esses conhecimentos. Utilize a IDE de sua preferência.
- Dicas: Lembre-se que as ações são implementadas através de métodos. Preste bastante atenção no tipo derelacionamento que existe entre os objetos. Utilize herança quando necessário e verique se existem possibilidades de implementar sobrecarga.

---

## Requisitos
1. Seu sistema deve permitir que um Cliente realize vários Pedidos. Para isso ele precisa:
Criar uma conta;
Registrar endereço;
Registrar forma de pagamento;
Adicionar Produto ao carrinho
2. O Cliente deve conter informações como: nome, endereço, email e cpf
3. O Cliente pode ser uma empresa. Dessa forma, pode conter um cnpj
4. Um Pedido pode conter vários Produtos mas um Produto pode pertencer apenas a um Pedido. Um Cliente
pode fazer vários Pedidos mas um Pedido pode conter apenas um Cliente
5. O Cliente pode entrar em contato com um Atendente Virtual. Um Atendente Virtual pode atender vários
Clientes
6. A Entrega do Pedido deve ser realizada de 3 formas diferentes: Entrega padrão, entrega rápida ou retirada
na loja
7. O Pedido deve ter uma forma de Pagamento. As formas de Pagamento podem ser: Boleto, Crédito, Débito
ou PIX.
8. Caso a forma de pagamento seja PIX, aplique um desconto de 15%
9. Cada pedido deve gerar uma Nota Fiscal com informações do cliente e pedido. A Nota Fiscal existe apenas
se um Pedido for gerado
10. Desenhe o diagrama de classes do seu projeto e envie junto com o projeto
