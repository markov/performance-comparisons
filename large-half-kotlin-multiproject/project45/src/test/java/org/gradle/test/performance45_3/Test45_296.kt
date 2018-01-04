package org.gradle.test.performance45_3

import org.junit.Assert.*

class Test45_296 {
    private val production = Production45_296("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
