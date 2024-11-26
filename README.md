
# Observador de Pássaros

Você é um entusiasta de observação de pássaros e acompanha quantos pássaros visitaram seu jardim nos últimos sete dias. Aqui estão as instruções para realizar algumas tarefas relacionadas à contagem de pássaros.

## Tarefas

### 1. Verificar as contagens da semana passada
Por questões de comparação, você sempre mantém uma cópia das contagens da semana passada, que foram: 0, 2, 5, 3, 7, 8 e 4. Implemente o método `BirdWatcher.getLastWeek()` para retornar as contagens da semana passada.

```java
BirdWatcher.getLastWeek();
// => [0, 2, 5, 3, 7, 8, 4]
```

### 2. Verificar quantos pássaros visitaram hoje
Implemente o método `BirdWatcher.getToday()` para retornar quantos pássaros visitaram seu jardim hoje. As contagens de pássaros são ordenadas por dia, com o primeiro elemento sendo o número de pássaros do dia mais antigo, e o último elemento sendo o número de hoje.

```java
int[] birdsPerDay = { 2, 5, 0, 7, 4, 1 };
BirdWatcher birdCount = new BirdWatcher(birdsPerDay);
birdCount.getToday();
// => 1
```

### 3. Incrementar a contagem de hoje
Implemente o método `BirdWatcher.incrementTodaysCount()` para incrementar a contagem de pássaros de hoje.

```java
int[] birdsPerDay = { 2, 5, 0, 7, 4, 1 };
BirdWatcher birdCount = new BirdWatcher(birdsPerDay);
birdCount.incrementTodaysCount();
birdCount.getToday();
// => 2
```

### 4. Verificar se houve um dia sem pássaros
Implemente o método `BirdWatcher.hasDayWithoutBirds()` para retornar `true` se houve um dia em que nenhum pássaro visitou o jardim. Caso contrário, retorne `false`.

```java
int[] birdsPerDay = { 2, 5, 0, 7, 4, 1 };
BirdWatcher birdCount = new BirdWatcher(birdsPerDay);
birdCount.hasDayWithoutBirds();
// => true
```

### 5. Calcular o número de pássaros para os primeiros dias
Implemente o método `BirdWatcher.getCountForFirstDays()` para retornar o número de pássaros que visitaram seu jardim desde o início da semana, mas limitando a contagem ao número especificado de dias a partir do início da semana.

```java
int[] birdsPerDay = { 2, 5, 0, 7, 4, 1 };
BirdWatcher birdCount = new BirdWatcher(birdsPerDay);
birdCount.getCountForFirstDays(4);
// => 14
```

### 6. Calcular o número de dias movimentados
Alguns dias são mais movimentados do que outros. Um dia movimentado é aquele em que cinco ou mais pássaros visitaram seu jardim. Implemente o método `BirdWatcher.getBusyDays()` para retornar o número de dias movimentados.

```java
int[] birdsPerDay = { 2, 5, 0, 7, 4, 1 };
BirdWatcher birdCount = new BirdWatcher(birdsPerDay);
birdCount.getBusyDays();
// => 2
```

---

Com essas tarefas, você será capaz de acompanhar e analisar a visitação de pássaros no seu jardim de forma mais eficiente!
