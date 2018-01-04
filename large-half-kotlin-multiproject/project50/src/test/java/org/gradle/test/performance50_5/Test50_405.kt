package org.gradle.test.performance50_5

import org.junit.Assert.*

class Test50_405 {
    private val production = Production50_405("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
