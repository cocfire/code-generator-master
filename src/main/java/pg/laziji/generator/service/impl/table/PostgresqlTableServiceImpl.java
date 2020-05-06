package pg.laziji.generator.service.impl.table;

import org.springframework.stereotype.Service;
import pg.laziji.generator.service.BaseTableService;

@Service("postgresql")
public class PostgresqlTableServiceImpl extends BaseTableService {

    @Override
    protected String getDriverClassName() {
        return "org.postgresql.Driver";
    }
}
