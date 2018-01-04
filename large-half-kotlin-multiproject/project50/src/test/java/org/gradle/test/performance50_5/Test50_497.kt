package org.gradle.test.performance50_5

import org.junit.Assert.*

class Test50_497 {
    private val production = Production50_497("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
