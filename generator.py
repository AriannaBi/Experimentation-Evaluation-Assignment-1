import csv
with open('gen.csv', 'w') as csvfile:
    name = ['Algorithms', 'Data type', 'Array size', 'Array sort', 'IDE']
    writer = csv.DictWriter(csvfile, fieldnames=name)
    writer.writeheader()

    algorithms = ["A1", "A2", "A3"]
    data_type = ["int", "string"]
    array_size = ["100", "1000"]
    array_sort = ["ord", "rand", "rev"]
    ide = ["intelliJ", "VSC"]



    counter = 0
    for a in algorithms:
        for b in data_type:
            for c in array_size:
                for d in array_sort:
                    for e in ide:
                        counter += 1
                        writer.writerow({'Algorithms': a, 'Data type':b, 'Array size':c, 'Array sort':d, 'IDE':e})
                        # print(a, b, c, d, e)
    print("COUNTER: ", counter)