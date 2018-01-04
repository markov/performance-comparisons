package org.gradle.test.performance49_1

import org.junit.Assert.*

class Test49_97 {
    private val production = Production49_97("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
