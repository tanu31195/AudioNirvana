package io.github.tanu31195.audionirvana;

public class Search {
//    public List<Earphone> getEarphonesList( EarphoneSearchCriteria earphoneSearchCriteria )
//    {
//        List<Earphone> earphones = new ArrayList<Earphone>();
//        Connection con = null;
//        PreparedStatement ps = null;
//        ResultSet rs = null;
//
//        try
//        {
//            con = conPool.getConnection();
//
//            StringBuilder sb=new StringBuilder(  );
//            sb.append( " SELECT * FROM EARPHONES" );
//            sb.append( " WHERE " );
//            sb.append( " 1 = 1 " );
//
//            if( ServiceUtils.isNotNull( transferServiceAllocationSearchCriteria.getCompany() ) )
//            {
//                sb.append( " AND RES_BOOKING.COMPANY                                                = ? " );
//            }
//            if( ServiceUtils.isNotNull( transferServiceAllocationSearchCriteria.getDivision() ) )
//            {
//                sb.append( " AND RES_BOOKING.DIVISION                                               = ? " );
//            }
//            if( ServiceUtils.isNotNull( transferServiceAllocationSearchCriteria.getBrand() ) )
//            {
//                sb.append( " AND RES_BOOKING.BRAND                                                  = ? " );
//            }
//            if( ServiceUtils.isNotNull( transferServiceAllocationSearchCriteria.getPickupLocation() ) )
//            {
//                sb.append( " AND TBX_AFMS_BKG_UPLOAD_TEMP.PICKUP_POINT                              = ? " );
//            }
//            if( ServiceUtils.isNotNull( transferServiceAllocationSearchCriteria.getDropOffLocation() ) )
//            {
//                sb.append( " AND TBX_AFMS_BKG_UPLOAD_TEMP.DROP_OFF_POINT                            = ? " );
//            }
//            if( ServiceUtils.isNotNull( transferServiceAllocationSearchCriteria.getTransferMode() ) )
//            {
//                sb.append( " AND TBX_AFMS_BKG_UPLOAD_TEMP.TRANSFER_MODE IN                           ( " );
//                sb.append( SupplierOperationUtil.tmListToSQL( transferServiceAllocationSearchCriteria.getTransferMode() ) );
//                sb.append( " ) " );
//            }
//            if( ServiceUtils.isNotNull( transferServiceAllocationSearchCriteria.getPickupType() ) )
//            {
//                sb.append( " AND TBX_AFMS_BKG_UPLOAD_TEMP.PICKUP_POINT_TYPE                         = ? " );
//            }
//            if( ServiceUtils.isNotNull( transferServiceAllocationSearchCriteria.getDropOffType() ) )
//            {
//                sb.append( " AND TBX_AFMS_BKG_UPLOAD_TEMP.DROPOFF_POINT_TYPE                        = ? " );
//            }
//
//
//            sb.append( " ORDER BY " );
//            sb.append( " TBX_AFMS_BKG_UPLOAD_TEMP.TRANSFER_DATE, " );
//            sb.append( " TBX_AFMS_BKG_UPLOAD_TEMP.TRS_ITEM_NO, " );
//            sb.append( " TBX_AFMS_BKG_UPLOAD_TEMP.TOU_ITI_ITEM_NO " );
//
//            ps = con.prepareStatement( sb.toString() );
//            int count=0;
//
//            if( ServiceUtils.isNotNull( transferServiceAllocationSearchCriteria.getCompany() ) )
//            {
//                ps.setString( ++count, transferServiceAllocationSearchCriteria.getCompany());
//            }
//            if( ServiceUtils.isNotNull( transferServiceAllocationSearchCriteria.getDivision() ) )
//            {
//                ps.setString( ++count, transferServiceAllocationSearchCriteria.getDivision());
//            }
//            if( ServiceUtils.isNotNull( transferServiceAllocationSearchCriteria.getBrand() ) )
//            {
//                ps.setString( ++count, transferServiceAllocationSearchCriteria.getBrand());
//            }
//            if( ServiceUtils.isNotNull( transferServiceAllocationSearchCriteria.getPickupLocation() ) )
//            {
//                ps.setString( ++count, transferServiceAllocationSearchCriteria.getPickupLocation());
//            }
//            if( ServiceUtils.isNotNull( transferServiceAllocationSearchCriteria.getDropOffLocation() ) )
//            {
//                ps.setString( ++count, transferServiceAllocationSearchCriteria.getDropOffLocation());
//            }
//            if( ServiceUtils.isNotNull( transferServiceAllocationSearchCriteria.getTransferMode() ) )
//            {
//                //                ps.setString( ++count, transferServiceAllocationSearchCriteria.getTransferMode());
//            }
//            if( ServiceUtils.isNotNull( transferServiceAllocationSearchCriteria.getPickupType() ) )
//            {
//                ps.setString( ++count, transferServiceAllocationSearchCriteria.getPickupType());
//            }
//            if( ServiceUtils.isNotNull( transferServiceAllocationSearchCriteria.getDropOffType() ) )
//            {
//                ps.setString( ++count, transferServiceAllocationSearchCriteria.getDropOffType());
//            }
//}
}