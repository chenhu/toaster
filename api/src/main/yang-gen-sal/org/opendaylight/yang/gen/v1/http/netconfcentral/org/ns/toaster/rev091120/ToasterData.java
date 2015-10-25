package org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120;
import org.opendaylight.yangtools.yang.binding.DataRoot;


/**
 * YANG version of the TOASTER-MIB.
 *
 * &lt;p&gt;This class represents the following YANG schema fragment defined in module &lt;b&gt;toaster&lt;/b&gt;
 * &lt;br&gt;Source path: &lt;i&gt;META-INF/yang/toaster.yang&lt;/i&gt;):
 * &lt;pre&gt;
 * module toaster {
 *     yang-version 1;
 *     namespace "http://netconfcentral.org/ns/toaster";
 *     prefix "toast";
 *
 *     revision 2009-11-20 {
 *         description "YANG version of the TOASTER-MIB.
 *         ";
 *     }
 *
 *     container toaster {
 *         leaf toasterManufacturer {
 *             type DisplayString;
 *         }
 *         leaf toasterModelNumber {
 *             type DisplayString;
 *         }
 *         leaf toasterStatus {
 *             type enumeration;
 *         }
 *     }
 *
 *     identity toast-type {
 *         description
 *             "Base for all bread types supported by the toaster. New bread types not listed here nay be added in the future.";
 *         status CURRENT;
 *     }
 *     identity wheat-bread {
 *         base "()IdentitySchemaNodeImpl[base=null, qname=(http://netconfcentral.org/ns/toaster?revision=2009-11-20)toast-type]";
 *         description
 *             "Wheat bread.";
 *         status CURRENT;
 *     }
 *     identity white-bread {
 *         base "()IdentitySchemaNodeImpl[base=null, qname=(http://netconfcentral.org/ns/toaster?revision=2009-11-20)toast-type]";
 *         description
 *             "White bread.";
 *         status CURRENT;
 *     }
 * }
 * &lt;/pre&gt;
 *
 */
public interface ToasterData
    extends
    DataRoot
{




    /**
     * Top-level container for all toaster database objects.
     *
     */
    Toaster getToaster();

}

