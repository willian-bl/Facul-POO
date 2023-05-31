/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colecoes;

/**
 *
 * @author willi
 */

import java.util.*;

public class TestaHashMap {
    
    public static void main(String[] args) {
        // A classe HashMap, que é usada para criar mapas, implementa a interface Map
        HashMap<Integer,String> usuarios = new HashMap();

        // Criando usando a interface
        Map<Integer,String> usuarios2 = new HashMap();

        // O método para incluir chave e valor é o put
        usuarios.put(10, "Fernando");
        usuarios.put(20, "Claudia");
        usuarios.put(30, "Ana");
        usuarios.put(50, "Paulo");

        System.out.println("Mapa de usuários: " + usuarios);
        
        // Método size retorna a quantidade de pares chave:valor do mapa
        System.out.println("Tamanho do nosso mapa: " + usuarios.size());
        
        // Se der um put em uma chave que já existe ele substitui o elemento:
        usuarios.put(10, "Orsi");
        System.out.println("Mapa depois de alterar o usuário na posição 10: " + usuarios);
        
        // Já o método putIfAbsent só inclui o elemento se a chave não existir. Se ela existir, deixa a lista como está
        usuarios.putIfAbsent(10, "Fernando");
        System.out.println("Mapa depois de usar putIfAbsent: " + usuarios);

        // Uma forma de verificar se o mapa está vazio é com o método isEmpty. É a mesma coisa que testar se o mapa.size() == 0
        System.out.println("Nosso mapa está vazio? " + usuarios.isEmpty());
        
        // Retorna o conjunto das chaves - Método keySet()
        System.out.println("Chaves: " + usuarios.keySet());
        
        // Retorna o conjunto dos valores - Método values()
        System.out.println("Valores: " + usuarios.values());
        
        // Para mostrar os pares do mapa (conjunto de chaves E valores - Método entrySet()
        System.out.println("Chaves e Valores: " + usuarios.entrySet());
        
        // O método containsKey() verifica se uma chave existe em um dado mapa
        System.out.println("Mapa contem a chave 20? " + usuarios.containsKey(20));
        System.out.println("Mapa contem a chave 40? " + usuarios.containsKey(40));
        
        // Já o método containsValue() verifica se um valor existe ou não no mapa
        System.out.println("Mapa contem o valor Orsi? " + usuarios.containsValue("Magrin"));
        System.out.println("Mapa contem o valor Magrin? " + usuarios.containsValue("Orsi"));
        
        // O método get() recebe uma chave e retorna o valor que está associado àquela chave
        System.out.println("Qual valor está associado à chave 20? " + usuarios.get(20));
        
        System.out.println("\n-----------------------------------------------\n");
        
        System.out.println("Printando somente as chaves: ");
        for(int chave:usuarios.keySet()){
            System.out.println("Chave: " + chave);
        }
        
        System.out.println("Printando somente os valores: ");
        for(String valor:usuarios.values()){
            System.out.println("Valor: " + valor);
        }
        
        System.out.println("Printando tudo usando o entrySet: ");
        // O entrySet gera um objeto do tipo Map.Entry, que vamos usar para iterar e pegar depois as chaves e valores
        // Temos que especificar os tipos da chave e do valor no Map.Entry também
        // Os métodos getKey e getValue vão retornar para nós, separadamente, a chave e o valor de uma entrada
        for(Map.Entry<Integer, String> par:usuarios.entrySet()){
            System.out.println("Chave: " + par.getKey() + " Valor: " + par.getValue());
        }
        
        System.out.println("\n-----------------------------------------------\n");
        
        // Remoção de elementos
        // Os mapas tem o método remove. Passamos como parâmetro a chave que queremos realizar a remoção
        System.out.println("Usuário removido: " + usuarios.remove(20));  
        System.out.println("Mapa depois de removido o valor: " + usuarios);
        
        System.out.println("\n-----------------------------------------------\n");
        
        // Também conseguimos iterar por um HashMap usando o iterator
        
        System.out.println("Obtenção de chave pelo iterator: ");
        Iterator <Integer> iteraChave = usuarios.keySet().iterator();
        while(iteraChave.hasNext()){
            int chave = iteraChave.next();
            System.out.println(chave);
        }
        
        System.out.println("\n-----------------------------------------------\n");
        
        System.out.println("Obtenção dos valores pelo iterator: ");
        Iterator <String> iteraValor = usuarios.values().iterator();
        while(iteraValor.hasNext()){
            System.out.println(iteraValor.next());
        }
        
        System.out.println("\n-----------------------------------------------\n");
        
        System.out.println("Obtenção de pares pelo iterator");
        Iterator <Map.Entry<Integer, String>> iteraPar = usuarios.entrySet().iterator();
        while(iteraPar.hasNext()){
            Map.Entry<Integer, String> entrada = iteraPar.next();
            System.out.println(entrada.getKey() + " -> " + entrada.getValue());
        }
        
        
    }
}
