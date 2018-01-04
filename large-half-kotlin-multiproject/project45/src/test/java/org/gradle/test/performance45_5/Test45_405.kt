package org.gradle.test.performance45_5

import org.junit.Assert.*

class Test45_405 {
    private val production = Production45_405("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
