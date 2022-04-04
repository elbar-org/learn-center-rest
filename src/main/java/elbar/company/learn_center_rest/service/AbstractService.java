package elbar.company.learn_center_rest.service;

import elbar.company.learn_center_rest.mapper.BaseMapper;
import elbar.company.learn_center_rest.repository.BaseRepository;
import elbar.company.learn_center_rest.validator.BaseValidator;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public abstract class AbstractService<V extends BaseValidator, M extends BaseMapper, R extends BaseRepository> implements BaseService {
    protected final V validator;
    protected final M mapper;
    protected final R repository;
}
