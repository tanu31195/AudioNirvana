package io.github.tanu31195.audionirvana;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Search {
    public List<Earphone> getEarphonesList(EarphoneSearchCriteria earphoneSearchCriteria) {
        List<Earphone> earphonesList = new ArrayList<Earphone>();
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try
        {
//            con = conPool.getConnection();

            StringBuilder sb=new StringBuilder(  );
            sb.append( " SELECT * FROM EARPHONES" );
            sb.append( " WHERE " );
            sb.append( " 1 = 1 " );

            if( AudioNirvanaUtils.isNotAny( earphoneSearchCriteria.getType() ) )
            {
                sb.append( " AND EARPHONES.TYPE                                                = ? " );
            }
            if( AudioNirvanaUtils.isNotAny( earphoneSearchCriteria.getSound() ) )
            {
                sb.append( " AND EARPHONES.SOUND                                           = ? " );
            }
            if( AudioNirvanaUtils.isNotAny( earphoneSearchCriteria.getFrequencyRange() ) )
            {
                if (earphoneSearchCriteria.getFrequencyRange().equalsIgnoreCase("!high"))
                {
                    sb.append( " AND EARPHONES.FREQRANGE                                         <> ? " );
                }
                else
                {
                    sb.append( " AND EARPHONES.FREQRANGE                                         = ? " );
                }
            }
            if( AudioNirvanaUtils.isNotAny( earphoneSearchCriteria.getNoiseCancelling() ) )
            {
                sb.append( " AND EARPHONES.NC                                           = ? " );
            }
            if( AudioNirvanaUtils.isNotAny( earphoneSearchCriteria.getPortable() ) )
            {
                sb.append( " AND EARPHONES.PORTABLE                                           = ? " );
            }
            if( AudioNirvanaUtils.isNotAny( earphoneSearchCriteria.getBack() ) )
            {
                sb.append( " AND EARPHONES.BACK                                           = ? " );
            }
            if( AudioNirvanaUtils.isNotAny( earphoneSearchCriteria.getWireless() ) )
            {
                sb.append( " AND EARPHONES.WIRELESS                                           = ? " );
            }
            if( AudioNirvanaUtils.isNotAny( earphoneSearchCriteria.getComfort() ) )
            {
                if (earphoneSearchCriteria.getComfort().equalsIgnoreCase("!low"))
                {
                    sb.append( " AND EARPHONES.COMFORT                                         <> ? " );
                }
                else
                {
                    sb.append(" AND EARPHONES.COMFORT                                           = ? ");
                }
            }
            if( AudioNirvanaUtils.isNotAny( earphoneSearchCriteria.getImpedance() ) )
            {
                sb.append( " AND EARPHONES.IMPEDENCE                                           = ? " );
            }
            if( AudioNirvanaUtils.isNotAny( earphoneSearchCriteria.getDurability() ) )
            {
                if (earphoneSearchCriteria.getDurability().equalsIgnoreCase("!low"))
                {
                    sb.append( " AND EARPHONES.DURABILITY                                         <> ? " );
                }
                else
                {
                    sb.append(" AND EARPHONES.DURABILITY                                           = ? ");
                }
            }
            if( AudioNirvanaUtils.isNotAny( earphoneSearchCriteria.getCost() ) )
            {
                if (earphoneSearchCriteria.getCost().equalsIgnoreCase("!high"))
                {
                    sb.append( " AND EARPHONES.COST                                         <> ? " );
                }
                else
                {
                    sb.append(" AND EARPHONES.COST                                           = ? ");
                }
            }

            sb.append( " ORDER BY " );
            sb.append( " EARPHONE.MODEL" );

            ps = con.prepareStatement( sb.toString() );
            int count=0;

            if( AudioNirvanaUtils.isNotAny( earphoneSearchCriteria.getType() ) )
            {
                ps.setString( ++count, earphoneSearchCriteria.getType());
            }
            if( AudioNirvanaUtils.isNotAny( earphoneSearchCriteria.getSound() ) )
            {
                ps.setString( ++count, earphoneSearchCriteria.getSound());
            }
            if( AudioNirvanaUtils.isNotAny( earphoneSearchCriteria.getFrequencyRange() ) )
            {
                if (earphoneSearchCriteria.getFrequencyRange().equalsIgnoreCase("!high"))
                {
                    ps.setString( ++count, "high");
                }
                else
                {
                    ps.setString( ++count, earphoneSearchCriteria.getFrequencyRange());
                }
            }
            if( AudioNirvanaUtils.isNotAny( earphoneSearchCriteria.getNoiseCancelling() ) )
            {
                ps.setString( ++count, earphoneSearchCriteria.getNoiseCancelling());
            }
            if( AudioNirvanaUtils.isNotAny( earphoneSearchCriteria.getPortable() ) )
            {
                ps.setString( ++count, earphoneSearchCriteria.getPortable());
            }
            if( AudioNirvanaUtils.isNotAny( earphoneSearchCriteria.getBack() ) )
            {
                ps.setString( ++count, earphoneSearchCriteria.getBack());
            }
            if( AudioNirvanaUtils.isNotAny( earphoneSearchCriteria.getWireless() ) )
            {
                ps.setString( ++count, earphoneSearchCriteria.getWireless());
            }
            if( AudioNirvanaUtils.isNotAny( earphoneSearchCriteria.getComfort() ) )
            {
                if (earphoneSearchCriteria.getComfort().equalsIgnoreCase("!low"))
                {
                    ps.setString( ++count, "low");
                }
                else
                {
                    ps.setString( ++count, earphoneSearchCriteria.getComfort());
                }
            }
            if( AudioNirvanaUtils.isNotAny( earphoneSearchCriteria.getImpedance() ) )
            {
                ps.setString( ++count, earphoneSearchCriteria.getImpedance());
            }
            if( AudioNirvanaUtils.isNotAny( earphoneSearchCriteria.getDurability() ) )
            {
                if (earphoneSearchCriteria.getDurability().equalsIgnoreCase("!low"))
                {
                    ps.setString( ++count, "low");
                }
                else
                {
                    ps.setString( ++count, earphoneSearchCriteria.getDurability());
                }
            }
            if( AudioNirvanaUtils.isNotAny( earphoneSearchCriteria.getCost() ) )
            {
                if (earphoneSearchCriteria.getCost().equalsIgnoreCase("!high"))
                {
                    ps.setString( ++count, "high");
                }
                else
                {
                    ps.setString( ++count, earphoneSearchCriteria.getCost());
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return earphonesList;
    }
}