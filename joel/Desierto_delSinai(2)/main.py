from collections import Counter
casos=int(input())
lista=[]
for _ in range(casos):
    mapas=[]
    votes=int(input())
    for i in range(votes):
        entrada = input().rsplit(' ', 1)
        vote = entrada[0]
        times = int(entrada[1])
        for j in range(int(times)):
            mapas.append(vote)
    count = Counter(mapas)
    mas_votado = count.most_common(1) 
    llave_mas_repetida = mas_votado[0][0]
    lista.append(llave_mas_repetida)

for i in lista:
    print(i)
