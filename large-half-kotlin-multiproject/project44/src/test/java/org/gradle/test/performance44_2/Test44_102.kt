package org.gradle.test.performance44_2

import org.junit.Assert.*

class Test44_102 {
    private val production = Production44_102("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
