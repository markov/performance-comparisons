package org.gradle.test.performance45_2

import org.junit.Assert.*

class Test45_196 {
    private val production = Production45_196("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
