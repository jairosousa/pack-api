package com.jnsdev.parkapi.jwt;

import com.jnsdev.parkapi.entity.Usuario;
import com.jnsdev.parkapi.service.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * @Autor Jairo Nascimento
 * @Created 31/08/2023 - 16:08
 */

@RequiredArgsConstructor
@Service
public class JwtUserDetailsService implements UserDetailsService {

    private final UsuarioService usuarioService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Usuario usuario = usuarioService.buscarPorUsername(username);
        return new JwtUserDetails(usuario);
    }

    public JwtToken getTokenAuthenticated(String username) {
        Usuario.Role role = usuarioService.buscarRolePorUsername(username);
        return JwtUtils.createToken(username,role.name().substring("ROLE_".length()));
    }
}
