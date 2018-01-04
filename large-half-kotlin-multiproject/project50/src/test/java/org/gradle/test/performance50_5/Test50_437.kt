package org.gradle.test.performance50_5

import org.junit.Assert.*

class Test50_437 {
    private val production = Production50_437("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
