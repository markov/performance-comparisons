package org.gradle.test.performance45_1

import org.junit.Assert.*

class Test45_54 {
    private val production = Production45_54("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
