package org.gradle.test.performance3_4

import org.junit.Assert.*

class Test3_353 {
    private val production = Production3_353("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}