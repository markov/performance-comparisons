package org.gradle.test.performance45_2

import org.junit.Assert.*

class Test45_145 {
    private val production = Production45_145("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
