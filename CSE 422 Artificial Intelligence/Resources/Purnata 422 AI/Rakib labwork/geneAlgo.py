import numpy
import random
def create_reference_solution(population,queen):
    reference = numpy.random.randint(low=0, high=queen, size=(population,queen))  # Create array chromosome
    return reference

def horizontal(reference):
    horizontal_array = []
    for parent in reference:
        cost = 0
        for i in range(len(parent)):
            for j in range(i + 1, len(parent)):
                if parent[i] == parent[j]:
                    cost += 1
        horizontal_array.append(cost)
    return horizontal_array


def diagonal(reference):
    diagonal_array = []
    for parent in reference:
        intersect = 0
        for i in range(len(parent)):
            up = parent[i] + 1
            down = parent[i] - 1
            for j in range(i + 1, len(parent)):
                if (up == parent[j]):
                    intersect += 1
                if (down == parent[j]):
                    intersect += 1
                up += 1
                down -= 1
        diagonal_array.append(intersect)
    return diagonal_array

def goal_stage(queen) :
    i=(queen)*(queen-1)/2
    return i

def fitness(queen,reference):
    goal=goal_stage(queen)
    h_array = horizontal(reference)
    d_array = diagonal(reference)

    fitness_array = []
    for i in range(len(reference)):
        fitness_array.append(goal-h_array[i] - d_array[i])
    return fitness_array

def crossOver(x,y):
    index=random.randint(0,len(x))
    child1=numpy.concatenate([x[:index], y[index:]])
    child2=numpy.concatenate([y[:index], x[index:]])
    return child1,child2

def mutation(x):
    index=random.randint(0,len(x)-1)
    value=random.randint(0,len(x)-1)
    x[index]=value
    return x

def gen_algo(population, reference,queen):
    nmax=10000
    goal=goal_stage(queen)
    print("\ngoal fit for current population",goal)
    print("\nproblem dirmntion: ", queen,"x",queen)
    print("population size",population)
    print("max generation", nmax)
    while nmax>0:
        new_population=[]
        for i in range(population):
            child1,child2=crossOver(reference[random.randint(0,queen)],reference[random.randint(0,queen)])
            child1=mutation(child1)
            child2=mutation(child2)
            new_population.append(child1)
            new_population.append(child2)
            fitness_array=fitness(queen,new_population[-2:])
            for i in range(len(fitness_array)):
                if fitness_array[i]==goal:
                    return new_population[-2 + i]
        nmax-=1
    return None








if __name__ == "__main__":
    population = int(input("give population"))
    queen = int(input("give queen"))
    reference = create_reference_solution(population, queen)
    print(reference)
    print()
    gen_algo=gen_algo(population,reference,queen)
    if gen_algo == None:
        print("No solution found")
    else:
        print(gen_algo)



#print(goal_stage(queen))



# print(d_array)
# print(h_array)
# print(intersect_array)