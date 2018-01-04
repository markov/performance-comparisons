package org.gradle.test.performance45_5

import org.junit.Assert.*

class Test45_418 {
    private val production = Production45_418("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
