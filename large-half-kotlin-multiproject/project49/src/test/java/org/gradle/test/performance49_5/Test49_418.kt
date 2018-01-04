package org.gradle.test.performance49_5

import org.junit.Assert.*

class Test49_418 {
    private val production = Production49_418("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
