# enlace-projeto-integrador
Enlace é uma rede social que conecta pessoas com organizações, criada como projeto integrador do bootcamp da Generation Brasil.
# Modelo relacional - Enlace



## usuarios

**id**: chave primária.
**nome**: nome do(a) usuário(a).

**email**: e-mail do(a) usuário(a). Será utilizado como e-mail no login.
**senha**: senha do usuário/a. Será utilizada com senha no login.
**imagem_url**: link de imagem a ser utilizada como foto de perfil.
**criado_em**: data de criação do usuário/a.


## postagens
**id**: chave primária.
**conteudo**:  corpo da postagem, em formato de texto.
**abracei**: é a “curtida” da rede social.
**criado_em**: data de criação da postagem.
**atualizado_em**: data da última atualização da postagem.
**tema_id**: chave estrangeira da tabela temas.
**usuarios_id**: chave estrangeira da tabela usuario.


## temas
**id**: chave primária.
**tag**: uma palavra que marca o tema de uma postagem.
**descricao**: descrição sucinta do escopo da tag.
