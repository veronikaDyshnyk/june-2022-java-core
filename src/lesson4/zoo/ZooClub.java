package lesson4.zoo;

import java.util.*;
import java.util.stream.Collectors;

class ZooClub {
    private Map<Person, List<Pet>> map = new LinkedHashMap<>();

    public void addPersonToClub(Person person) {
        map.put(person, new ArrayList<>());
    }


    //1
//    public void addPetToPerson(Person person, Pet pet){
//        List<Pet> pets = map.get(person);
//        pets.add(pet);
//    }

    //2
//    public void addPetToPerson(int personID, Pet pet){
//        Iterator<Map.Entry<Person, List<Pet>>> iterator = map.entrySet().iterator();
//        while (iterator.hasNext()) {
//            Map.Entry<Person, List<Pet>> next = iterator.next();
//            if(next.getKey().getId() == personID){
//                next.getValue().add(pet);
//            }
//        }
//    }

    //3
    public void addPetToPerson(int personID, Pet pet) {
        Set<Person> people = map.keySet();
        for (Person person : people) {
            if (person.getId() == personID) {
                List<Pet> pets = map.get(person);
                pets.add(pet);
            }
        }
    }

    public void deletePetFromPerson(Pet pet, Person person) {
        List<Pet> pets = map.get(person);
        pets.removeIf(p -> p.equals(pet));
    }

    public void deletePersonFromClub(Person person) {
        map.remove(person);
    }

    //1
    public void deletePetFromAll(Pet pet){
        Collection<List<Pet>> values = map.values();
        Iterator<List<Pet>> iterator = values.iterator();
        while (iterator.hasNext()) {
            List<Pet> next = iterator.next();
            next.removeIf(pet1 -> pet1.equals(pet));
        }
    }

    //2
        public void deletePetFromAll(){
            Set<Map.Entry<Person, List<Pet>>> entries = map.entrySet();
            //2.1
//            entries.forEach(personPetsEntry ->{
//                List<Pet> value = personPetsEntry.getValue();
//                value.removeIf(pet -> pet.equals(pet));
//            } );
            //2.2
            entries.forEach(personListEntry -> {
                personListEntry
                        .setValue(
                                personListEntry
                                .getValue().
                                stream().
                                filter(pet -> !pet.equals(pet)).collect(Collectors.toList())
                        );
            });

        }


    public void print(){
        System.out.println(this.map);
    }

}
