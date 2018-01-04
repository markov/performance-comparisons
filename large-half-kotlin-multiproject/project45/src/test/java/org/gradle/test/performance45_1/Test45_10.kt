package org.gradle.test.performance45_1

import org.junit.Assert.*

class Test45_10 {
    private val production = Production45_10("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
