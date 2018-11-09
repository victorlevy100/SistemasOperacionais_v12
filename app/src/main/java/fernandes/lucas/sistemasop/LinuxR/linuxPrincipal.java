package fernandes.lucas.sistemasop.LinuxR;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import fernandes.lucas.sistemasop.R;
import fernandes.lucas.sistemasop.RecyclerViewAdapter;
import fernandes.lucas.sistemasop.windowsR.Windows;


public class linuxPrincipal extends AppCompatActivity {

    List<Windows> lstWindows;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linux_principal);

        lstWindows = new ArrayList<>();
        lstWindows.add(new Windows("Linux 1","Sistema Operacional","Aqui começa a história da Microsoft com seus sistemas operacionais Windows. A primeira versão do SO foi lançada em novembro de 1985 e foi a tentativa inicial da companhia em entregar uma interface gráfica em 16 bits.\n" + "O Windows 1 foi construído sobre o MS-DOS e seu funcionamento se apoiava bastante nas entradas inseridas nas linhas de comando do sistema. Apesar disso, a Microsoft já havia colocado suporte ao mouse, incluindo, também, um jogo para “ensinar” as pessoas a utilizarem esse novo periférico.\n" + "Em 1985 a Microsoft e a IBM assinam acordo para desenvolvimento conjunto de um futuro sistema operacional, no mesmo ano lança o Microsoft Windows 1.0. Em 1987 a Microsoft compra o programa de apresentações PowerPoint e lança a planilha eletrônica Excel.",R.drawable.windows1,R.drawable.windows1imagem));

        lstWindows.add(new Windows("Windows 2","Sistema Operacional","Dois anos depois da estreia no mercado de sistemas operacionais, a Microsoft resolveu fazer o lançamento do Windows 2 em dezembro de 1987. A grande inovação desse software era a possibilidade de as janelas sobreporem umas às outras, funcionalidade que parece piada nos dias de hoje.\n" +
                "Também foi incluída a possibilidade de minimizar e maximizar as janelas, e o conhecido Painel de Controle, que reunia as principais ferramentas do sistema, também fez a sua estreia no Windows 2. Outras duas ferramentas que apareceram debutaram nesta versão e permanecem até hoje são o Word e o Excel, pertencentes ao Pacote Office.\n",R.drawable.windows2,R.drawable.windows2sistema));

        lstWindows.add(new Windows("Windows 3","Sistema Operacional","Lançado em 1990, este foi o primeiro SO da Microsoft a exigir um disco rígido para ser instalado. Este também foi aquele que despertou a atenção do mercado para o nome “Windows”, colocando-o de vez na disputa pela popularidade.\n" +
                "A grande inovação do Windows 3 diz respeito aos programas do MS-DOS que agora podiam ser executados em uma janela normal, dando bastante flexibilidade aos que não se adaptavam logo de cara com a interface gráfica do software. O suporte a 256 cores e o jogo “Paciência” (Solitaire, em inglês) foram outras novidades importantes dessa versão do SO.\n",R.drawable.windows3,R.drawable.windows3sistema));


        lstWindows.add(new Windows("Windows 95","Sistema Operacional","Como o nome sugere, esse SO da Microsoft foi lançado no ano de 1995 e trouxe, pela primeira vez, o Menu Iniciar e a Barra de ferramentas tão familiares para todos nós. O Windows 95 também inaugurou o conceito de “plug and play”, facilitando bastante a vida de quem precisasse utilizar um periférico diferente.\n" +
                "Foi nesta versão que o Internet Explorer fez a sua estreia, mas chegou apenas em um pacote adicional lançado posteriormente. A arquitetura de 32 bits também começou a aparecer nesse SO e o MS-DOS ainda era necessário para executar uma série de funções do sistema e acessar muitos de seus recursos.\n" +
                "\n" +
                "REQUISITOS DO SISTEMA:\n" +
                "\n" +
                "• Computador pessoal com um 386DX ou processador superior (486 recomendado);\n" +
                "\n" +
                "• 4 megabytes (MB) de memória (8 MB recomendado;)\n" +
                "\n" +
                "• Espaço em disco rígido normal necessário para uma atualização para o Windows 95: 35-40 MB a necessidade real varia de acordo com os recursos que você optar por instalar.;\n" +
                "\n" +
                "• Espaço no disco rígido típica necessário para instalar o Windows 95 em um sistema limpo: 55 50 MB a necessidade real varia de acordo com os recursos que você optar por instalar.;\n" +
                "\n" +
                "• Uma unidade 3,5 polegadas de alta densidade disquete disco;\n" +
                "\n" +
                "• VGA ou resolução superior (SVGA de 256 cores recomendado);\n" +
                "\n" +
                "• Para usar o Microsoft Exchange e o Microsoft Network:\n" +
                "\n" +
                "• 8 MB de memória;\n",R.drawable.windows95,R.drawable.windows95sistema));




        lstWindows.add(new Windows("Windows 98","Sistema Operacional","Lançado em 1998, o Windows 98 foi construído sobre a versão anterior e trouxe uma série de novidades. Entre elas estão o IE 4, o Outlook Express, o Windows Address Book, o Microsoft Chat e o NetShow Play, que posteriormente seria substituído pelo Windows Media Player. Com exceção do IE, do Outlook e do WMP, todas as outras ferramentas já foram aposentadas ou substituídas.\n" +
                "O Windows 98 introduziu o recurso de avançar e voltar na navegação, além da barra de endereço no Windows Explorer. O suporte ao padrão USB também foi bastante aprimorado, dando início a uma adoção generalizada desse formato.\n" +
                "\n" +
                "REQUISITOS DO SISTEMA:\n" +
                "\n" +
                "• Intel 80486DX2/66 MHz ou um processador que comporta pontos flutuantes (Um processador Pentium é recomendado);\n" +
                "\n" +
                "• 16MB de memória RAM (24 é recomendado; é possível ainda rodar o Windows 98 em máquinas de 8MB com a opção /nm usada durante o processo de instalação);\n" +
                "\n" +
                "• Upgrade do Windows 95 (FAT16) ou Windows 3.1 (FAT): 140 – 400MB (geralmente 205MB);\n" +
                "\n" +
                "• Ao menos 500MB de espaço disponível no HD. A quantidade de espaço requisitado depende do método de instalação e do tipo de componentes selecionados, mas a memória virtual e outros utilitários do sistema devem ser levados em consideração;\n" +
                "\n" +
                "• Nova instalação (FAT32): 140 – 255MB (tipicamente 175MB);\n" +
                "\n" +
                "• Monitor VGA ou de maior resolução (640x480);\n" +
                "\n" +
                "• Drive de CD-ROM ou DVD-ROM (a instalação por disquete é possível, mas lenta);\n" +
                "\n" +
                "• Mouse da Microsoft ou compatível (opcional);\n" +
                "\nOs usuários podem fazem alterações para esses requisitos com a mudança não descrita da instalação /NM. Isso permite a instalação do Windows 98 em máquinas mais antigas, como o 80386. O VCACHE do Windows 98 não foi designado para rodar com mais de 1.0GB de RAM sem que sejam feitas alterações.\n" +
                "Tanto o Windows 98 como o Windows 98 SE possuem problemas ao serem rodados em drivers maiores de 32 Gigabytes (GB) e com certas configurações da BIOS da Phoenix. Uma atualização do software corrige este problema. Além do mais, o próprio Windows XP sem ao menos um Service Pack é incapaz de rodar corretamente com HDs superiores à 137GB de tamanho, devido a falta do suporte ao endereçamento de bloco lógico de 48-bit – um corrompimento de dados pode ocorrer. Correções por terceiros estão disponíveis para corrigir estes problemas presentes na família Windows 9x.\n",R.drawable.windows98,R.drawable.windows98sistema));



        lstWindows.add(new Windows("Windows 2000","Sistema Operacional","O Microsoft Windows 2000 foi um sistema operacional preemptivo, gráfico e de fácil aprendizagem que foi desenvolvido para trabalhar com um ou mais processadores de 32 bits em computadores na arquitetura x86. É parte de uma linha de sistemas operacionais denominada Microsoft Windows NT e foi lançado em 17 de fevereiro de 2000, sendo o sucessor do Windows NT 4.0. Ele está disponível em quatro versões: Professional, Server, Advanced Server e Datacenter Server. Adicionalmente, a Microsoft oferece o Windows 2000 Advanced Server - Edição Limitada, que foi lançado em 2001 e roda em processadores de 64 bits Itanium. O Windows 2000 é classificado com um sistema operacional de núcleo híbrido, e sua arquitetura é dividida em dois modos: usuário e núcleo. O \"modo núcleo\" dá acesso total aos recursos do sistema e suporta a execução das aplicações em modo usuário, com acesso restrito aos recursos.\n" +
                "\n" +
                "REQUISITOS DO SISTEMA:\n" +
                "\n" +
                "WINDOWS 2000 PROFESSIONAL\n" +
                "\n" +
                "• CPU Pentium ou compatível de 133 MHz ou superior;\n" +
                "\n" +
                "• 64 megabytes (MB) de memória RAM (128MB recomendados);\n" +
                "\n" +
                "• 700 megabytes de espaço em disco (2GB recomendados;)\n" +
                "\n" +
                "WINDOWS 2000 SERVER\n" +
                "\n" +
                "• CPU Pentium ou compatível de 133 MHz ou superior;\n" +
                "\n" +
                "• Mínimo recomendado de 256 MB de memória RAM;\n" +
                "\n" +
                "• Mouse da Microsoft ou compatível (opcional);\n" +
                "\n" +
                "• 2 GB espaço em disco\n" +
                "\n" +
                "WINDOWS 2000 ADVANCED SERVER\n" +
                "\n" +
                "• CPU Pentium ou compatível de 133 MHz ou superior;\n" +
                "\n" +
                "• Mínimo recomendado de 256 MB de memória RAM;\n" +
                "\n" +
                "• 2 GB de espaço em disco;\n",R.drawable.windows2000,R.drawable.windows2000sistema));




        lstWindows.add(new Windows("Windows XP","Sistema Operacional","Alguns argumentam que esta seja a melhor versão do sistema operacional da Microsoft. Ela foi lançada em outubro de 2001 e foi a que mais durou no mercado, recebendo suporte até o mês de abril de 2014 – 13 anos após a sua estreia no segmento.\n" +
                "O SO ainda se mostra relativamente popular, estando presente em mais de 20% dos computadores de todos os adeptos do SO. As principais novidades foram a repaginada no visual e a estabilidade do sistema, que agradou e conquistou milhões de usuários ao redor do mundo.\n" +
                "\n" +
                "O Windows XP foi uma família de sistemas operacionais de 32 e 64 bits produzido pela Microsoft, para uso em computadores pessoais, incluindo computadores residenciais e de escritório, notebooks, tablets e media centers. O nome \"XP\" deriva de eXPerience. O Windows XP é o sucessor de ambos os Windows 2000 e Windows ME e é o primeiro sistema operacional para consumidores produzido pela Microsoft construído em nova arquitetura e núcleo (Windows NT 5.1). O Windows XP foi lançado no dia 25 de outubro de 2001 e mais de 400 milhões de cópias estavam em uso em janeiro de 2006, de acordo com estimativas feitas naquele mês pela empresa de estatísticas IDC. Foi sucedido pelo Windows Vista lançado para pré-fabricantes no dia 8 de Novembro de 2006 e para o público em geral em 30 de Janeiro de 2007. Suas vendas cessaram no dia 30 de junho de 2008, porém ainda era possível adquirir novas licenças com os desenvolvedores do sistema até 31 de janeiro de 2009 ou comprando e instalando as edições Ultimate ou Business do Windows Vista e então realizando o downgrade para o Windows XP.\n" +
                "\n"+
                "O WINDOWS XP VEIO COM UMA GAMA DE RECURSOS MUITO MAIOR DO QUE OS SISTEMAS ANTERIORES, INCLUINDO:\n" +
                "\n" +
                "• Sequências rápidas de iniciação e hibernação;\n" +
                "\n" +
                "• A capacidade do sistema operacional desconectar um dispositivo externo sem a necessidade de reiniciar o computador;\n" +
                "\n" +
                "• Uma nova interface de uso mais fácil, incluindo ferramentas para desenvolver temas de escritórios.\n" +
                "\n" +
                "• Uma habilidade de alternância de contas de usuários, na qual quem está logado pode alternar em outra conta sem fechar os arquivos abertos;\n" +
                "\n" +
                "• O Clear Type é um mecanismo para dar realce e sombras a um texto, é especificamente adotado para monitores de LCD;\n" +
                "\n" +
                "• A funcionalidade da Assistência Remota, com a permissão de usuários se conectarem ao seu XP pela rede de internet e acessar seus arquivos e imprimi-los, executar aplicações e outros;\n" +
                "\n" +
                "• Suporte para rede DSL e Wireless;\n" +
                "\n" +
                "• Um novo conjunto de temas ou estilos visuais, conhecidos pelo codinome Luna;\n" +
                "\n",R.drawable.windowsxp,R.drawable.windowsxpsistema));



        lstWindows.add(new Windows("Windows 7","Sistema Operacional","Vencendo com facilidade a liderança de sistemas operacionais mais utilizados do mercado, o Windows 7 disputa o topo do ranking na preferência de usuários com o XP. Lançado em 2009, esse SO trouxe mudanças visuais pequenas em relação ao seu antecessor, mas é mais rápido, estável e fácil de utilizar.\n" +
                "Mais da metade da população mundial que tem acesso a um computador utiliza o Windows 7 como sistema operacional principal em sua máquina. Isso mostra como a Microsoft acertou em cheio com esta versão de seu software.\n"+
                "\n"+
                "ALUGNS DOS RECURSOS ADICIONADOS E MELHORADOS:\n"+
                "\n" +
                "• Interface gráfica aprimorada, com nova barra de tarefas e suporte para telas touch screene multi-táctil (multi-touch);\n" +
                "\n" +
                "• Internet Explorer 8;\n" +
                "\n" +
                "• O aplicativo “Notas autoadesivas” foi reformulado; \n" +
                "\n" +
                "• Windows Defender;\n" +
                "\n" +
                "• Novo Menu Iniciar;\n" +
                "\n" +
                "• Windows Photo Slide (Sucessor do DreamScene) muda a Wallpaper no desktop de segundos até 1 dia;\n" +
                "\n" +
                "• Nova barra de tarefas totalmente reformulada que permite fixar o atalho do aplicativo como um favorito;\n" +
                "\n" +
                "• A funcionalidade da Assistência Remota, com a permissão de usuários se conectarem ao seu XP pela rede de internet e acessar seus arquivos e imprimi-los, executar aplicações e outros.\n" +
                "\n" +
                "• comando de voz (inglês);\n" +
                "\n" +
                "EDIÇÕES:\n" +
                "\n"+
                "O Windows 7, assim como o Windows Vista, tem disponível seis diferentes edições, porém apenas o Home Premium, Professional e Ultimate são vendidos na maioria dos países. As outras três edições Starter, Home Basic. O Enterprise é oferecido as empresas que se concentram em outros mercados, como mercados de empresas ou só para países em desenvolvimento. \n" +
                "\n"+
                "REQUISITOS DO SISTEMA:\n"+
                "\n"+
                "• Componente x76(32bits) ou x64(64bits);\n"+
                "\n"+
                "• Processador de 1GHz;\n"+
                "\n"+
                "• Memória RAM com mínimo de 1GB de RAM, sendo recomendável a partir de 2GB de RAM;\n"+
                "\n"+
                "• Placa Gráfica: Suporte para o dispositivo de gráficos DirectX 9 com 128MB de memória gráfica (Para Aero Glass);\n"+
                "\n"+
                "• Espaço livre: 16GB de espaço em disco disponível. Recomendável 20 GB de espaço disponível;\n"+
                "\n"+
                "• Unidade Óptica: Unidade de DVD ou entrada USB;\n",R.drawable.windows7,R.drawable.windows7sistema));



        lstWindows.add(new Windows("Windows 8.1","Sistema Operacional","Trazendo mudanças sutis em relação ao seu antecessor, o Windows 8.1 veio em resposta às reclamações das pessoas por causa das alterações visuais que o SO sofreu. Por causa disso, a Microsoft decidiu retroceder e trazer de voltar o botão do Menu Iniciar.\n" +
                "Além disso, as pessoas podiam escolher iniciar o computador diretamente a partir da Área de trabalho, o que não era possível com o Windows 8. Não houve mudanças significativas em relação à estabilidade e à velocidade do sistema.\n"+
                "\n"+
                "ALGUNS DOS RECURSOS PRESENTES:\n"+
                "\n"+
                "INTERNET EXPLORER 11\n"+
                "A atualização para o Windows 8.1 traz o Internet Explorer 11, cuja versão de área de trabalho teve poucas mudanças em relação à versão anterior, porém, sua Metro foi bem alterada.\n"+
                "\n"+
                "BOTÃO INICIAR\n"+
                "Devido a inúmeras reclamações e críticas, a Microsoft confirmou a volta do Botão Iniciar na barra de tarefas da área de trabalho do sistema operacional; entretanto, ele é um atalho para a Tela Inicial do Windows 8.1, que, porém, não se assemelha ao Menu Iniciar das versões da plataforma do Windows do Windows 95 ao Windows 7. Entretanto, ao clicar com o botão direito do mouse no botão Iniciar, aparecerão várias funções do antigo Menu Iniciar.\n"+
                "\n"+
                "PERSONALIZAÇÃO E INTERFACE\n"+
                "O Windows 8.1 conserva a mesma interface do Windows 8 (a interface Metro UI), porém possui mais opções de personalização, como a possibilidade de usar o mesmo papel de parede da área de trabalho na tela inicial. Os blocos dinâmicos agora possuem quatro tamanhos diferentes. A Microsoft aplicou algumas pequenas alterações para deixar a interface Metro UI mais acessível não só para telas sensíveis ao joia, mas também para quem usa mouse e teclado.\n" +
                "Com o Windows 8.1 Update 1, alguns itens nesta interface podem mudar, com foco nos computadores com mouse e teclado.\n\n"+
                "\n"+
                "INICIALIZAÇÃO\n"+
                "A Microsoft também anunciou que o usuário poderá escolher entre ir diretamente para a Área de trabalho ou a Tela Inicial quando iniciar o sistema após inúmeras críticas.\n"+
                "\n"+
                "NOVOS APLICATIVOS:\n"+
                "A Microsoft embutiu alguns aplicativos nosos e recursos no Windows 8.1, como: Alarmes, Calculadora, Lista de Leitura, Receitas e Bebidas\n"+
                "\n"+
                "RECURSOS REMOVIDOS:\n"+
                "O sistema operativo Windows 8.1 é uma atualização mais modesta e menos radical, porém, alguns recursos foram removidos, entre os quais destacam-se o aplicativo Mensagens, que foi substituído pelo recurso de mensagens da versão Metro do Skype (porém, com a perda de alguns recursos), e o aplicativo de busca do Bing. que foi substituído pelo novo recurso de busca do sistema, que é anexado ao Bing.\n"+
                "\n"+
                "REQUISITOS DO SISTEMA:\n"+
                "\n"+
                "• Processador: 1GHz ou mais rápido;\n"+
                "\n"+
                "• Memória RAM: 1GB(32bits) ou 2GB(64bits);\n"+
                "\n"+
                "• ESpaço disponível no disco rígido: 16 GB(32bits) ou 20 GB(64bits);\n"+
                "\n"+
                "• Placa de vídeo: dispositivo gráfico com MicrosoftDirectx 9 e driver WDDM;\n"+
                "\n",R.drawable.windows81,R.drawable.windows81sistema));


        lstWindows.add(new Windows("Windows 10","Sistema Operacional","O Windows 10 é a versão mais recente do sistema operacional da Microsoft e representa uma série de mudanças relevantes na forma como o SO é produzido, distribuído e mantido pela desenvolvedora norte-americana. Ao contrário de edições anteriores, o Windows 10 é vendido como um serviço: em vez de um Windows 11, por exemplo, os usuários recebem grandes atualizações, que promovem a adição de novos recursos e tecnologias de forma gratuita e horizontal, já que todo mundo passa a ter acesso a essas novidades.\n"+
                "\n"+
                "RECURSOS DO WINDOWS 10:\n"+
                "Microsoft Edge: O novo navegador sucessor do IE\n"+
                "Resultado do tão aguardado Project Spartan, o novo navegador da Microsoft promete superar o atual Internet Explorer em desempenho e funcionalidades. Visualmente ele é bastante parecido com o Google Chrome: abas ficam na parte superior e o restante fica logo abaixo.\n" +
                "No novo browser, a Microsoft investiu em um modo de leitura para sites de notícia, anotações manuscritas e sincronizadas com o OneDrive e, claro, a integração com a assistente de voz Cortana. Assim como o Google Chrome e o Mozilla Firefox, o Microsoft Edge também suportará complementos, plugins e extensões.\n" +
                "\n"+
                "MENU INICIAR\n"+
                "Uma das grandes polêmicas em torno do Windows 8 girou em torno da ausência do tradicional menu Iniciar. O recurso, que voltou no Windows 8.1, é parte central da experiência de uso do Windows 10 em sua versão desktop e apresenta uma grande variedade de modos de customização para agradar os usuários.\n"+
                "\n"+
                "MODO JOGO\n"+
                "Outra novidade do Creators Update para Windows 10 é o modo jogo. Com o recurso habilitado, o Windows desliga serviços que acabam roubando desempenho e direciona todo o potencial do computador para os games, garantindo assim desempenho melhor na hora de jogar.\n"+
                "\n"+
                "MÚLTIPLAS ÁREAS DE TRABALHO\n"+
                "Comum em outros sistemas, os desktops múltiplos finalmente chegaram ao Windows com a versão 10. Ao clicar em um botão localizado na barra de tarefas, um desktop novo com programas e pastas independentes poderá ser criado para oferecer mais organização ao computador.\n"+
                "O usuário pode testar a combinação de teclas Windows + Tab, como uma versão mais luxuosa de Alt + Tab. Mas em vez de alternar os aplicativos, o atalho mostrará a interface estilo Expose (ou Mission Control) do recurso, onde poderá criar ou alternar entre vários desktops. Além disso, você pode pressionar Ctrl+Windows+direito ou esquerdo, para se mover entre as áreas de trabalho virtuais.\n"+
                "Para tornar o gerenciamento disso tudo possível, foi adicionado à barra do Windows, um novo botão de visualização de tarefas. Ao clicar nele, é exibido basicamente o mesmo que na combinação das teclas ALT + TAB. Porém, na parte inferior, aparece uma lista das áreas de trabalho abertas e, ao passar o mouse sobre os itens, é oferecida uma opção para fechar apps, adicionar ou remover desktops.\n"+
                "\n"+
                "CORTANA\n"+
                "Uma das maiores novidades do Windows 10 é a assistente pessoal Cortana. Ela nasceu no Windows Phone e é um dos melhores recursos desse sistema, que agora chega ao Windows 10. Ela pode ser chamada por meio de comandos de voz simples como “Hey Cortana” e permite escolher uma música, abrir apresentações, consultar a previsão do tempo ou e-mails usando apenas a voz.\n"+
                "\n"+
                "SUPORTE PARA TECNOLOGIA DLNA\n"+
                "A Microsoft também melhorou o suporte para a tecnologia DLNA ou Digital Living Network Alliance. Isso tornará bem mais fácil a integração do PC com dispositivos de mídia, e ouvir músicas ou assistir vídeos do computador na sua TV será muito mais simples.\n"+
                "\n"+
                "RECURSOS REMOVIDOS:\n"+
                "O Windows Media Center foi descontinuado e é desinstalado durante a atualização das versões anteriores para o Windows 10. Atualizações de versões do Windows que possuíam o Windows Media Center recebem o Windows DVD Player (normalmente, pago) gratuitamente por um tempo limitado, que não foi especificado pela Microsoft; a função de gravação de TV foi perdida. A Microsoft afirma que \"existem outros aplicativos populares para reproduzir DVD, que estarão disponíveis e funcionarão após a atualização para o Windows 10\".\n"+
                "\n"+
                "REQUISITOS DO SISTEMA:\n"+
                "\n"+
                "• Memória RAM: 1GB para 32bits ou 2GB para 64bits;\n"+
                "\n"+
                "• Espaço do disco rígido: 16 GB para um SO de 32 bits ou 20 GB para um SO de 64 bits; \n"+
                "\n"+
                "• Placa gráfica: DirectX 9 ou posterior com driver WDDM 1.0;\n"+
                "\n"+
                "• Tela: 800x600;\n"+
                "\n"+
                "• Processador: 1Ghz ou mais ráido ou SOC;\n"+
                "\n",R.drawable.windows10,R.drawable.windows10sistema));

        RecyclerView myrv = (RecyclerView) findViewById(R.id.recyclerview_id);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this,lstWindows);
        myrv.setLayoutManager(new GridLayoutManager(this,3));
        myrv.setAdapter(myAdapter);

    }
}
