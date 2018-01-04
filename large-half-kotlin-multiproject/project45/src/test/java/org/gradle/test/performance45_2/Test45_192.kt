package org.gradle.test.performance45_2

import org.junit.Assert.*

class Test45_192 {
    private val production = Production45_192("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
