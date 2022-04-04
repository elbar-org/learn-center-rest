package elbar.company.learn_center_rest.service;

import elbar.company.learn_center_rest.mapper.BaseMapper;
import elbar.company.learn_center_rest.repository.BaseRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public abstract class AbstractService<M extends BaseMapper, R extends BaseRepository> implements BaseService {
    protected final M mapper;
    protected final R repository;
}
