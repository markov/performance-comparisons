package org.gradle.test.performance45_2

import org.junit.Assert.*

class Test45_193 {
    private val production = Production45_193("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
